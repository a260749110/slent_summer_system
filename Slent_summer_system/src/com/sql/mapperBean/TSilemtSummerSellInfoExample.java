package com.sql.mapperBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TSilemtSummerSellInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSilemtSummerSellInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMoneyTrueIsNull() {
            addCriterion("money_true is null");
            return (Criteria) this;
        }

        public Criteria andMoneyTrueIsNotNull() {
            addCriterion("money_true is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyTrueEqualTo(Float value) {
            addCriterion("money_true =", value, "moneyTrue");
            return (Criteria) this;
        }

        public Criteria andMoneyTrueNotEqualTo(Float value) {
            addCriterion("money_true <>", value, "moneyTrue");
            return (Criteria) this;
        }

        public Criteria andMoneyTrueGreaterThan(Float value) {
            addCriterion("money_true >", value, "moneyTrue");
            return (Criteria) this;
        }

        public Criteria andMoneyTrueGreaterThanOrEqualTo(Float value) {
            addCriterion("money_true >=", value, "moneyTrue");
            return (Criteria) this;
        }

        public Criteria andMoneyTrueLessThan(Float value) {
            addCriterion("money_true <", value, "moneyTrue");
            return (Criteria) this;
        }

        public Criteria andMoneyTrueLessThanOrEqualTo(Float value) {
            addCriterion("money_true <=", value, "moneyTrue");
            return (Criteria) this;
        }

        public Criteria andMoneyTrueIn(List<Float> values) {
            addCriterion("money_true in", values, "moneyTrue");
            return (Criteria) this;
        }

        public Criteria andMoneyTrueNotIn(List<Float> values) {
            addCriterion("money_true not in", values, "moneyTrue");
            return (Criteria) this;
        }

        public Criteria andMoneyTrueBetween(Float value1, Float value2) {
            addCriterion("money_true between", value1, value2, "moneyTrue");
            return (Criteria) this;
        }

        public Criteria andMoneyTrueNotBetween(Float value1, Float value2) {
            addCriterion("money_true not between", value1, value2, "moneyTrue");
            return (Criteria) this;
        }

        public Criteria andSellIdIsNull() {
            addCriterion("sell_id is null");
            return (Criteria) this;
        }

        public Criteria andSellIdIsNotNull() {
            addCriterion("sell_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellIdEqualTo(Integer value) {
            addCriterion("sell_id =", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdNotEqualTo(Integer value) {
            addCriterion("sell_id <>", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdGreaterThan(Integer value) {
            addCriterion("sell_id >", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_id >=", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdLessThan(Integer value) {
            addCriterion("sell_id <", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdLessThanOrEqualTo(Integer value) {
            addCriterion("sell_id <=", value, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdIn(List<Integer> values) {
            addCriterion("sell_id in", values, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdNotIn(List<Integer> values) {
            addCriterion("sell_id not in", values, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdBetween(Integer value1, Integer value2) {
            addCriterion("sell_id between", value1, value2, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_id not between", value1, value2, "sellId");
            return (Criteria) this;
        }

        public Criteria andSellNameIsNull() {
            addCriterion("sell_name is null");
            return (Criteria) this;
        }

        public Criteria andSellNameIsNotNull() {
            addCriterion("sell_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellNameEqualTo(String value) {
            addCriterion("sell_name =", value, "sellName");
            return (Criteria) this;
        }

        public Criteria andSellNameNotEqualTo(String value) {
            addCriterion("sell_name <>", value, "sellName");
            return (Criteria) this;
        }

        public Criteria andSellNameGreaterThan(String value) {
            addCriterion("sell_name >", value, "sellName");
            return (Criteria) this;
        }

        public Criteria andSellNameGreaterThanOrEqualTo(String value) {
            addCriterion("sell_name >=", value, "sellName");
            return (Criteria) this;
        }

        public Criteria andSellNameLessThan(String value) {
            addCriterion("sell_name <", value, "sellName");
            return (Criteria) this;
        }

        public Criteria andSellNameLessThanOrEqualTo(String value) {
            addCriterion("sell_name <=", value, "sellName");
            return (Criteria) this;
        }

        public Criteria andSellNameLike(String value) {
            addCriterion("sell_name like", value, "sellName");
            return (Criteria) this;
        }

        public Criteria andSellNameNotLike(String value) {
            addCriterion("sell_name not like", value, "sellName");
            return (Criteria) this;
        }

        public Criteria andSellNameIn(List<String> values) {
            addCriterion("sell_name in", values, "sellName");
            return (Criteria) this;
        }

        public Criteria andSellNameNotIn(List<String> values) {
            addCriterion("sell_name not in", values, "sellName");
            return (Criteria) this;
        }

        public Criteria andSellNameBetween(String value1, String value2) {
            addCriterion("sell_name between", value1, value2, "sellName");
            return (Criteria) this;
        }

        public Criteria andSellNameNotBetween(String value1, String value2) {
            addCriterion("sell_name not between", value1, value2, "sellName");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Long value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Long value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Long value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Long value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Long value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Long> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Long> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Long value1, Long value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Long value1, Long value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayNameIsNull() {
            addCriterion("pay_name is null");
            return (Criteria) this;
        }

        public Criteria andPayNameIsNotNull() {
            addCriterion("pay_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayNameEqualTo(String value) {
            addCriterion("pay_name =", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotEqualTo(String value) {
            addCriterion("pay_name <>", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameGreaterThan(String value) {
            addCriterion("pay_name >", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_name >=", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLessThan(String value) {
            addCriterion("pay_name <", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLessThanOrEqualTo(String value) {
            addCriterion("pay_name <=", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLike(String value) {
            addCriterion("pay_name like", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotLike(String value) {
            addCriterion("pay_name not like", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameIn(List<String> values) {
            addCriterion("pay_name in", values, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotIn(List<String> values) {
            addCriterion("pay_name not in", values, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameBetween(String value1, String value2) {
            addCriterion("pay_name between", value1, value2, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotBetween(String value1, String value2) {
            addCriterion("pay_name not between", value1, value2, "payName");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andFlightIsNull() {
            addCriterion("flight is null");
            return (Criteria) this;
        }

        public Criteria andFlightIsNotNull() {
            addCriterion("flight is not null");
            return (Criteria) this;
        }

        public Criteria andFlightEqualTo(Date value) {
            addCriterionForJDBCDate("flight =", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotEqualTo(Date value) {
            addCriterionForJDBCDate("flight <>", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightGreaterThan(Date value) {
            addCriterionForJDBCDate("flight >", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("flight >=", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightLessThan(Date value) {
            addCriterionForJDBCDate("flight <", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("flight <=", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightIn(List<Date> values) {
            addCriterionForJDBCDate("flight in", values, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotIn(List<Date> values) {
            addCriterionForJDBCDate("flight not in", values, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("flight between", value1, value2, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("flight not between", value1, value2, "flight");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Boolean value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Boolean value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Boolean value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Boolean value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Boolean> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Boolean> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}