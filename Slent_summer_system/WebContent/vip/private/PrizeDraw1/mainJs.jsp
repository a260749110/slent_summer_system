<%@page import="com.spring.service.impl.SqlService"%>
<%@page import="com.spring.sql.domain.SPrizeDrawItemPo"%>
<%@page import="com.spring.sql.dao.SPrizeDrawItemDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	List<SPrizeDrawItemPo> list = SqlService.getInstance().prizeDrawItemDao.getAll();
%>
<script type="text/javascript">
var info=[];
var info1=[];
var prize_size = 0;
var clickFlag=false;
<%for (SPrizeDrawItemPo po : list) {
				if (po.getEnable() > 0) {%>
					info.push('<%=po.getName()%>');
					info1.push('<%=po.getTip()%>');
	prize_size++;
<%}
			}%>
	$(document)
			.ready(
					function() {
						//旋转角度
						var angles;
						//可抽奖次数
						var clickNum = 5;
						//旋转次数
						var rotNum = 0;
						//中奖公告
						var notice = null;
						//转盘初始化
						var color = [ "#ff6138", "#00a388", "rgba(0,0,0,0.5)",
								"#DCC722", "white", "#FF4350" ];

						canvasRun();
						$('#tupBtn').bind(
								'click',
								function() {
									if(clickFlag==true)
										{
										return ;
										}
									clickFlag=true;
					try {
							$.post("helper/prizeDrawHelper.jsp", "",
									function(d, s) {
										var data = eval("(" + d + ")");
									
										if (data.flag == false)
											{
											
											alert(data.msg);
											clickFlag=false;
											return;
											}
										runCup(data.resultIndex);
										$("#myIntegral").html("我的积分:"+data.integral);
										setTimeout(function() {
											clickFlag=false;
											alert(notice);
											$('#tupBtn').removeAttr(
													"disabled", true);
										}, 6000);
									})
									
					} catch (e) {
						// TODO: handle exception
						location.reload(false);
					}
									
								});

						//转盘旋转
						function runCup(num) {
							probability(num);
							var degValue = 'rotate(' + angles + 'deg' + ')';
							$('#myCanvas').css('-o-transform', degValue); //Opera
							$('#myCanvas').css('-ms-transform', degValue); //IE浏览器
							$('#myCanvas').css('-moz-transform', degValue); //Firefox
							$('#myCanvas').css('-webkit-transform', degValue); //Chrome和Safari
							$('#myCanvas').css('transform', degValue);
						}
						var rollCount = 1;
						//各奖项对应的旋转角度及中奖公告内容
						function probability(num) {
							//获取随机

							angles = 2160 * rollCount + 1800 + 360.0 / prize_size
									* num;
							notice = info[num] + info1[num];
							rollCount++;
						}

						//绘制转盘
						function canvasRun() {
							var canvas = document.getElementById('myCanvas');
							var canvas01 = document
									.getElementById('myCanvas01');
							var canvas03 = document
									.getElementById('myCanvas03');
							var canvas02 = document
									.getElementById('myCanvas02');
							var ctx = canvas.getContext('2d');
							var ctx1 = canvas01.getContext('2d');
							var ctx3 = canvas03.getContext('2d');
							var ctx2 = canvas02.getContext('2d');
							createCircle();
							createCirText();
							initPoint();

							//外圆
							function createCircle() {
								var startAngle = 0;//扇形的开始弧度
								var endAngle = 0;//扇形的终止弧度
								//画一个8等份扇形组成的圆形
								for (var i = 0; i < prize_size; i++) {

									startAngle = Math.PI
											* (i / (prize_size / 2.0) - 1.0
													/ prize_size - 0.5);
									endAngle = startAngle + Math.PI
											* (1.0 / (prize_size / 2.0));
									ctx.save();
									ctx.beginPath();
									ctx.arc(150, 150, 100, startAngle,
											endAngle, false);
									ctx.lineWidth = 120;
									if (i % 2 == 0) {
										ctx.strokeStyle = color[0];
									} else {
										ctx.strokeStyle = color[1];
									}
									ctx.stroke();
									ctx.restore();
								}
							}

							//各奖项
							function createCirText() {
								ctx.textAlign = 'start';
								ctx.textBaseline = 'middle';
								ctx.fillStyle = color[3];
								var step = -2 * Math.PI / prize_size;
								for (var i = 0; i < prize_size; i++) {
									ctx.save();
									ctx.beginPath();
									ctx.translate(150, 150);
									ctx.rotate(i * step);
									ctx.font = " 20px Microsoft YaHei";
									ctx.fillStyle = color[3];
									ctx.fillText(info[i], -30, -115, 60);
									ctx.font = " 14px Microsoft YaHei";
									ctx.fillText(info1[i], -30, -95, 60);
									ctx.closePath();
									ctx.restore();
								}
							}

							function initPoint() {
								//箭头指针
								ctx1.beginPath();
								ctx1.moveTo(100, 24);
								ctx1.lineTo(90, 62);
								ctx1.lineTo(110, 62);
								ctx1.lineTo(100, 24);
								ctx1.fillStyle = color[5];
								ctx1.fill();
								ctx1.closePath();
								//中间小圆
								ctx3.beginPath();
								ctx3.arc(100, 100, 40, 0, Math.PI * 2, false);
								ctx3.fillStyle = color[5];
								ctx3.fill();
								ctx3.closePath();
								//小圆文字
								ctx3.font = "Bold 20px Microsoft YaHei";
								ctx3.textAlign = 'start';
								ctx3.textBaseline = 'middle';
								ctx3.fillStyle = color[4];
								ctx3.beginPath();
								ctx3.fillText('开始', 80, 90, 40);
								ctx3.fillText('抽奖', 80, 110, 40);
								ctx3.fill();
								ctx3.closePath();
								//中间圆圈
								ctx2.beginPath();
								ctx2.arc(75, 75, 75, 0, Math.PI * 2, false);
								ctx2.fillStyle = color[2];
								ctx2.fill();
								ctx2.closePath();
							}
						}
					});
</script>
