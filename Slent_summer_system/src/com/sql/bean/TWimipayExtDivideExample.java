package com.sql.bean;

import java.util.ArrayList;
import java.util.List;

public class TWimipayExtDivideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWimipayExtDivideExample() {
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

        public Criteria andCodeNoIsNull() {
            addCriterion("code_no is null");
            return (Criteria) this;
        }

        public Criteria andCodeNoIsNotNull() {
            addCriterion("code_no is not null");
            return (Criteria) this;
        }

        public Criteria andCodeNoEqualTo(String value) {
            addCriterion("code_no =", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoNotEqualTo(String value) {
            addCriterion("code_no <>", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoGreaterThan(String value) {
            addCriterion("code_no >", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoGreaterThanOrEqualTo(String value) {
            addCriterion("code_no >=", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoLessThan(String value) {
            addCriterion("code_no <", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoLessThanOrEqualTo(String value) {
            addCriterion("code_no <=", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoLike(String value) {
            addCriterion("code_no like", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoNotLike(String value) {
            addCriterion("code_no not like", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoIn(List<String> values) {
            addCriterion("code_no in", values, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoNotIn(List<String> values) {
            addCriterion("code_no not in", values, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoBetween(String value1, String value2) {
            addCriterion("code_no between", value1, value2, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoNotBetween(String value1, String value2) {
            addCriterion("code_no not between", value1, value2, "codeNo");
            return (Criteria) this;
        }

        public Criteria andWipayIdIsNull() {
            addCriterion("wipay_id is null");
            return (Criteria) this;
        }

        public Criteria andWipayIdIsNotNull() {
            addCriterion("wipay_id is not null");
            return (Criteria) this;
        }

        public Criteria andWipayIdEqualTo(String value) {
            addCriterion("wipay_id =", value, "wipayId");
            return (Criteria) this;
        }

        public Criteria andWipayIdNotEqualTo(String value) {
            addCriterion("wipay_id <>", value, "wipayId");
            return (Criteria) this;
        }

        public Criteria andWipayIdGreaterThan(String value) {
            addCriterion("wipay_id >", value, "wipayId");
            return (Criteria) this;
        }

        public Criteria andWipayIdGreaterThanOrEqualTo(String value) {
            addCriterion("wipay_id >=", value, "wipayId");
            return (Criteria) this;
        }

        public Criteria andWipayIdLessThan(String value) {
            addCriterion("wipay_id <", value, "wipayId");
            return (Criteria) this;
        }

        public Criteria andWipayIdLessThanOrEqualTo(String value) {
            addCriterion("wipay_id <=", value, "wipayId");
            return (Criteria) this;
        }

        public Criteria andWipayIdLike(String value) {
            addCriterion("wipay_id like", value, "wipayId");
            return (Criteria) this;
        }

        public Criteria andWipayIdNotLike(String value) {
            addCriterion("wipay_id not like", value, "wipayId");
            return (Criteria) this;
        }

        public Criteria andWipayIdIn(List<String> values) {
            addCriterion("wipay_id in", values, "wipayId");
            return (Criteria) this;
        }

        public Criteria andWipayIdNotIn(List<String> values) {
            addCriterion("wipay_id not in", values, "wipayId");
            return (Criteria) this;
        }

        public Criteria andWipayIdBetween(String value1, String value2) {
            addCriterion("wipay_id between", value1, value2, "wipayId");
            return (Criteria) this;
        }

        public Criteria andWipayIdNotBetween(String value1, String value2) {
            addCriterion("wipay_id not between", value1, value2, "wipayId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNull() {
            addCriterion("prefix is null");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNotNull() {
            addCriterion("prefix is not null");
            return (Criteria) this;
        }

        public Criteria andPrefixEqualTo(String value) {
            addCriterion("prefix =", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotEqualTo(String value) {
            addCriterion("prefix <>", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThan(String value) {
            addCriterion("prefix >", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("prefix >=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThan(String value) {
            addCriterion("prefix <", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThanOrEqualTo(String value) {
            addCriterion("prefix <=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLike(String value) {
            addCriterion("prefix like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotLike(String value) {
            addCriterion("prefix not like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixIn(List<String> values) {
            addCriterion("prefix in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotIn(List<String> values) {
            addCriterion("prefix not in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixBetween(String value1, String value2) {
            addCriterion("prefix between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotBetween(String value1, String value2) {
            addCriterion("prefix not between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andPcodeNoIsNull() {
            addCriterion("pcode_no is null");
            return (Criteria) this;
        }

        public Criteria andPcodeNoIsNotNull() {
            addCriterion("pcode_no is not null");
            return (Criteria) this;
        }

        public Criteria andPcodeNoEqualTo(String value) {
            addCriterion("pcode_no =", value, "pcodeNo");
            return (Criteria) this;
        }

        public Criteria andPcodeNoNotEqualTo(String value) {
            addCriterion("pcode_no <>", value, "pcodeNo");
            return (Criteria) this;
        }

        public Criteria andPcodeNoGreaterThan(String value) {
            addCriterion("pcode_no >", value, "pcodeNo");
            return (Criteria) this;
        }

        public Criteria andPcodeNoGreaterThanOrEqualTo(String value) {
            addCriterion("pcode_no >=", value, "pcodeNo");
            return (Criteria) this;
        }

        public Criteria andPcodeNoLessThan(String value) {
            addCriterion("pcode_no <", value, "pcodeNo");
            return (Criteria) this;
        }

        public Criteria andPcodeNoLessThanOrEqualTo(String value) {
            addCriterion("pcode_no <=", value, "pcodeNo");
            return (Criteria) this;
        }

        public Criteria andPcodeNoLike(String value) {
            addCriterion("pcode_no like", value, "pcodeNo");
            return (Criteria) this;
        }

        public Criteria andPcodeNoNotLike(String value) {
            addCriterion("pcode_no not like", value, "pcodeNo");
            return (Criteria) this;
        }

        public Criteria andPcodeNoIn(List<String> values) {
            addCriterion("pcode_no in", values, "pcodeNo");
            return (Criteria) this;
        }

        public Criteria andPcodeNoNotIn(List<String> values) {
            addCriterion("pcode_no not in", values, "pcodeNo");
            return (Criteria) this;
        }

        public Criteria andPcodeNoBetween(String value1, String value2) {
            addCriterion("pcode_no between", value1, value2, "pcodeNo");
            return (Criteria) this;
        }

        public Criteria andPcodeNoNotBetween(String value1, String value2) {
            addCriterion("pcode_no not between", value1, value2, "pcodeNo");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMmchannelIsNull() {
            addCriterion("MMChannel is null");
            return (Criteria) this;
        }

        public Criteria andMmchannelIsNotNull() {
            addCriterion("MMChannel is not null");
            return (Criteria) this;
        }

        public Criteria andMmchannelEqualTo(String value) {
            addCriterion("MMChannel =", value, "mmchannel");
            return (Criteria) this;
        }

        public Criteria andMmchannelNotEqualTo(String value) {
            addCriterion("MMChannel <>", value, "mmchannel");
            return (Criteria) this;
        }

        public Criteria andMmchannelGreaterThan(String value) {
            addCriterion("MMChannel >", value, "mmchannel");
            return (Criteria) this;
        }

        public Criteria andMmchannelGreaterThanOrEqualTo(String value) {
            addCriterion("MMChannel >=", value, "mmchannel");
            return (Criteria) this;
        }

        public Criteria andMmchannelLessThan(String value) {
            addCriterion("MMChannel <", value, "mmchannel");
            return (Criteria) this;
        }

        public Criteria andMmchannelLessThanOrEqualTo(String value) {
            addCriterion("MMChannel <=", value, "mmchannel");
            return (Criteria) this;
        }

        public Criteria andMmchannelLike(String value) {
            addCriterion("MMChannel like", value, "mmchannel");
            return (Criteria) this;
        }

        public Criteria andMmchannelNotLike(String value) {
            addCriterion("MMChannel not like", value, "mmchannel");
            return (Criteria) this;
        }

        public Criteria andMmchannelIn(List<String> values) {
            addCriterion("MMChannel in", values, "mmchannel");
            return (Criteria) this;
        }

        public Criteria andMmchannelNotIn(List<String> values) {
            addCriterion("MMChannel not in", values, "mmchannel");
            return (Criteria) this;
        }

        public Criteria andMmchannelBetween(String value1, String value2) {
            addCriterion("MMChannel between", value1, value2, "mmchannel");
            return (Criteria) this;
        }

        public Criteria andMmchannelNotBetween(String value1, String value2) {
            addCriterion("MMChannel not between", value1, value2, "mmchannel");
            return (Criteria) this;
        }

        public Criteria andMmchannel343IsNull() {
            addCriterion("MMChannel_343 is null");
            return (Criteria) this;
        }

        public Criteria andMmchannel343IsNotNull() {
            addCriterion("MMChannel_343 is not null");
            return (Criteria) this;
        }

        public Criteria andMmchannel343EqualTo(String value) {
            addCriterion("MMChannel_343 =", value, "mmchannel343");
            return (Criteria) this;
        }

        public Criteria andMmchannel343NotEqualTo(String value) {
            addCriterion("MMChannel_343 <>", value, "mmchannel343");
            return (Criteria) this;
        }

        public Criteria andMmchannel343GreaterThan(String value) {
            addCriterion("MMChannel_343 >", value, "mmchannel343");
            return (Criteria) this;
        }

        public Criteria andMmchannel343GreaterThanOrEqualTo(String value) {
            addCriterion("MMChannel_343 >=", value, "mmchannel343");
            return (Criteria) this;
        }

        public Criteria andMmchannel343LessThan(String value) {
            addCriterion("MMChannel_343 <", value, "mmchannel343");
            return (Criteria) this;
        }

        public Criteria andMmchannel343LessThanOrEqualTo(String value) {
            addCriterion("MMChannel_343 <=", value, "mmchannel343");
            return (Criteria) this;
        }

        public Criteria andMmchannel343Like(String value) {
            addCriterion("MMChannel_343 like", value, "mmchannel343");
            return (Criteria) this;
        }

        public Criteria andMmchannel343NotLike(String value) {
            addCriterion("MMChannel_343 not like", value, "mmchannel343");
            return (Criteria) this;
        }

        public Criteria andMmchannel343In(List<String> values) {
            addCriterion("MMChannel_343 in", values, "mmchannel343");
            return (Criteria) this;
        }

        public Criteria andMmchannel343NotIn(List<String> values) {
            addCriterion("MMChannel_343 not in", values, "mmchannel343");
            return (Criteria) this;
        }

        public Criteria andMmchannel343Between(String value1, String value2) {
            addCriterion("MMChannel_343 between", value1, value2, "mmchannel343");
            return (Criteria) this;
        }

        public Criteria andMmchannel343NotBetween(String value1, String value2) {
            addCriterion("MMChannel_343 not between", value1, value2, "mmchannel343");
            return (Criteria) this;
        }

        public Criteria andDoublepaypercentIsNull() {
            addCriterion("doublePayPercent is null");
            return (Criteria) this;
        }

        public Criteria andDoublepaypercentIsNotNull() {
            addCriterion("doublePayPercent is not null");
            return (Criteria) this;
        }

        public Criteria andDoublepaypercentEqualTo(Integer value) {
            addCriterion("doublePayPercent =", value, "doublepaypercent");
            return (Criteria) this;
        }

        public Criteria andDoublepaypercentNotEqualTo(Integer value) {
            addCriterion("doublePayPercent <>", value, "doublepaypercent");
            return (Criteria) this;
        }

        public Criteria andDoublepaypercentGreaterThan(Integer value) {
            addCriterion("doublePayPercent >", value, "doublepaypercent");
            return (Criteria) this;
        }

        public Criteria andDoublepaypercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("doublePayPercent >=", value, "doublepaypercent");
            return (Criteria) this;
        }

        public Criteria andDoublepaypercentLessThan(Integer value) {
            addCriterion("doublePayPercent <", value, "doublepaypercent");
            return (Criteria) this;
        }

        public Criteria andDoublepaypercentLessThanOrEqualTo(Integer value) {
            addCriterion("doublePayPercent <=", value, "doublepaypercent");
            return (Criteria) this;
        }

        public Criteria andDoublepaypercentIn(List<Integer> values) {
            addCriterion("doublePayPercent in", values, "doublepaypercent");
            return (Criteria) this;
        }

        public Criteria andDoublepaypercentNotIn(List<Integer> values) {
            addCriterion("doublePayPercent not in", values, "doublepaypercent");
            return (Criteria) this;
        }

        public Criteria andDoublepaypercentBetween(Integer value1, Integer value2) {
            addCriterion("doublePayPercent between", value1, value2, "doublepaypercent");
            return (Criteria) this;
        }

        public Criteria andDoublepaypercentNotBetween(Integer value1, Integer value2) {
            addCriterion("doublePayPercent not between", value1, value2, "doublepaypercent");
            return (Criteria) this;
        }

        public Criteria andUmidIsNull() {
            addCriterion("umId is null");
            return (Criteria) this;
        }

        public Criteria andUmidIsNotNull() {
            addCriterion("umId is not null");
            return (Criteria) this;
        }

        public Criteria andUmidEqualTo(String value) {
            addCriterion("umId =", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidNotEqualTo(String value) {
            addCriterion("umId <>", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidGreaterThan(String value) {
            addCriterion("umId >", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidGreaterThanOrEqualTo(String value) {
            addCriterion("umId >=", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidLessThan(String value) {
            addCriterion("umId <", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidLessThanOrEqualTo(String value) {
            addCriterion("umId <=", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidLike(String value) {
            addCriterion("umId like", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidNotLike(String value) {
            addCriterion("umId not like", value, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidIn(List<String> values) {
            addCriterion("umId in", values, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidNotIn(List<String> values) {
            addCriterion("umId not in", values, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidBetween(String value1, String value2) {
            addCriterion("umId between", value1, value2, "umid");
            return (Criteria) this;
        }

        public Criteria andUmidNotBetween(String value1, String value2) {
            addCriterion("umId not between", value1, value2, "umid");
            return (Criteria) this;
        }

        public Criteria andDdoidIsNull() {
            addCriterion("ddoId is null");
            return (Criteria) this;
        }

        public Criteria andDdoidIsNotNull() {
            addCriterion("ddoId is not null");
            return (Criteria) this;
        }

        public Criteria andDdoidEqualTo(String value) {
            addCriterion("ddoId =", value, "ddoid");
            return (Criteria) this;
        }

        public Criteria andDdoidNotEqualTo(String value) {
            addCriterion("ddoId <>", value, "ddoid");
            return (Criteria) this;
        }

        public Criteria andDdoidGreaterThan(String value) {
            addCriterion("ddoId >", value, "ddoid");
            return (Criteria) this;
        }

        public Criteria andDdoidGreaterThanOrEqualTo(String value) {
            addCriterion("ddoId >=", value, "ddoid");
            return (Criteria) this;
        }

        public Criteria andDdoidLessThan(String value) {
            addCriterion("ddoId <", value, "ddoid");
            return (Criteria) this;
        }

        public Criteria andDdoidLessThanOrEqualTo(String value) {
            addCriterion("ddoId <=", value, "ddoid");
            return (Criteria) this;
        }

        public Criteria andDdoidLike(String value) {
            addCriterion("ddoId like", value, "ddoid");
            return (Criteria) this;
        }

        public Criteria andDdoidNotLike(String value) {
            addCriterion("ddoId not like", value, "ddoid");
            return (Criteria) this;
        }

        public Criteria andDdoidIn(List<String> values) {
            addCriterion("ddoId in", values, "ddoid");
            return (Criteria) this;
        }

        public Criteria andDdoidNotIn(List<String> values) {
            addCriterion("ddoId not in", values, "ddoid");
            return (Criteria) this;
        }

        public Criteria andDdoidBetween(String value1, String value2) {
            addCriterion("ddoId between", value1, value2, "ddoid");
            return (Criteria) this;
        }

        public Criteria andDdoidNotBetween(String value1, String value2) {
            addCriterion("ddoId not between", value1, value2, "ddoid");
            return (Criteria) this;
        }

        public Criteria andUnicomidIsNull() {
            addCriterion("unicomId is null");
            return (Criteria) this;
        }

        public Criteria andUnicomidIsNotNull() {
            addCriterion("unicomId is not null");
            return (Criteria) this;
        }

        public Criteria andUnicomidEqualTo(String value) {
            addCriterion("unicomId =", value, "unicomid");
            return (Criteria) this;
        }

        public Criteria andUnicomidNotEqualTo(String value) {
            addCriterion("unicomId <>", value, "unicomid");
            return (Criteria) this;
        }

        public Criteria andUnicomidGreaterThan(String value) {
            addCriterion("unicomId >", value, "unicomid");
            return (Criteria) this;
        }

        public Criteria andUnicomidGreaterThanOrEqualTo(String value) {
            addCriterion("unicomId >=", value, "unicomid");
            return (Criteria) this;
        }

        public Criteria andUnicomidLessThan(String value) {
            addCriterion("unicomId <", value, "unicomid");
            return (Criteria) this;
        }

        public Criteria andUnicomidLessThanOrEqualTo(String value) {
            addCriterion("unicomId <=", value, "unicomid");
            return (Criteria) this;
        }

        public Criteria andUnicomidLike(String value) {
            addCriterion("unicomId like", value, "unicomid");
            return (Criteria) this;
        }

        public Criteria andUnicomidNotLike(String value) {
            addCriterion("unicomId not like", value, "unicomid");
            return (Criteria) this;
        }

        public Criteria andUnicomidIn(List<String> values) {
            addCriterion("unicomId in", values, "unicomid");
            return (Criteria) this;
        }

        public Criteria andUnicomidNotIn(List<String> values) {
            addCriterion("unicomId not in", values, "unicomid");
            return (Criteria) this;
        }

        public Criteria andUnicomidBetween(String value1, String value2) {
            addCriterion("unicomId between", value1, value2, "unicomid");
            return (Criteria) this;
        }

        public Criteria andUnicomidNotBetween(String value1, String value2) {
            addCriterion("unicomId not between", value1, value2, "unicomid");
            return (Criteria) this;
        }

        public Criteria andTeleidIsNull() {
            addCriterion("teleId is null");
            return (Criteria) this;
        }

        public Criteria andTeleidIsNotNull() {
            addCriterion("teleId is not null");
            return (Criteria) this;
        }

        public Criteria andTeleidEqualTo(String value) {
            addCriterion("teleId =", value, "teleid");
            return (Criteria) this;
        }

        public Criteria andTeleidNotEqualTo(String value) {
            addCriterion("teleId <>", value, "teleid");
            return (Criteria) this;
        }

        public Criteria andTeleidGreaterThan(String value) {
            addCriterion("teleId >", value, "teleid");
            return (Criteria) this;
        }

        public Criteria andTeleidGreaterThanOrEqualTo(String value) {
            addCriterion("teleId >=", value, "teleid");
            return (Criteria) this;
        }

        public Criteria andTeleidLessThan(String value) {
            addCriterion("teleId <", value, "teleid");
            return (Criteria) this;
        }

        public Criteria andTeleidLessThanOrEqualTo(String value) {
            addCriterion("teleId <=", value, "teleid");
            return (Criteria) this;
        }

        public Criteria andTeleidLike(String value) {
            addCriterion("teleId like", value, "teleid");
            return (Criteria) this;
        }

        public Criteria andTeleidNotLike(String value) {
            addCriterion("teleId not like", value, "teleid");
            return (Criteria) this;
        }

        public Criteria andTeleidIn(List<String> values) {
            addCriterion("teleId in", values, "teleid");
            return (Criteria) this;
        }

        public Criteria andTeleidNotIn(List<String> values) {
            addCriterion("teleId not in", values, "teleid");
            return (Criteria) this;
        }

        public Criteria andTeleidBetween(String value1, String value2) {
            addCriterion("teleId between", value1, value2, "teleid");
            return (Criteria) this;
        }

        public Criteria andTeleidNotBetween(String value1, String value2) {
            addCriterion("teleId not between", value1, value2, "teleid");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidIsNull() {
            addCriterion("unicomMusicId is null");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidIsNotNull() {
            addCriterion("unicomMusicId is not null");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidEqualTo(String value) {
            addCriterion("unicomMusicId =", value, "unicommusicid");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidNotEqualTo(String value) {
            addCriterion("unicomMusicId <>", value, "unicommusicid");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidGreaterThan(String value) {
            addCriterion("unicomMusicId >", value, "unicommusicid");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidGreaterThanOrEqualTo(String value) {
            addCriterion("unicomMusicId >=", value, "unicommusicid");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidLessThan(String value) {
            addCriterion("unicomMusicId <", value, "unicommusicid");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidLessThanOrEqualTo(String value) {
            addCriterion("unicomMusicId <=", value, "unicommusicid");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidLike(String value) {
            addCriterion("unicomMusicId like", value, "unicommusicid");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidNotLike(String value) {
            addCriterion("unicomMusicId not like", value, "unicommusicid");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidIn(List<String> values) {
            addCriterion("unicomMusicId in", values, "unicommusicid");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidNotIn(List<String> values) {
            addCriterion("unicomMusicId not in", values, "unicommusicid");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidBetween(String value1, String value2) {
            addCriterion("unicomMusicId between", value1, value2, "unicommusicid");
            return (Criteria) this;
        }

        public Criteria andUnicommusicidNotBetween(String value1, String value2) {
            addCriterion("unicomMusicId not between", value1, value2, "unicommusicid");
            return (Criteria) this;
        }

        public Criteria andDmsmsIsNull() {
            addCriterion("dmsms is null");
            return (Criteria) this;
        }

        public Criteria andDmsmsIsNotNull() {
            addCriterion("dmsms is not null");
            return (Criteria) this;
        }

        public Criteria andDmsmsEqualTo(String value) {
            addCriterion("dmsms =", value, "dmsms");
            return (Criteria) this;
        }

        public Criteria andDmsmsNotEqualTo(String value) {
            addCriterion("dmsms <>", value, "dmsms");
            return (Criteria) this;
        }

        public Criteria andDmsmsGreaterThan(String value) {
            addCriterion("dmsms >", value, "dmsms");
            return (Criteria) this;
        }

        public Criteria andDmsmsGreaterThanOrEqualTo(String value) {
            addCriterion("dmsms >=", value, "dmsms");
            return (Criteria) this;
        }

        public Criteria andDmsmsLessThan(String value) {
            addCriterion("dmsms <", value, "dmsms");
            return (Criteria) this;
        }

        public Criteria andDmsmsLessThanOrEqualTo(String value) {
            addCriterion("dmsms <=", value, "dmsms");
            return (Criteria) this;
        }

        public Criteria andDmsmsLike(String value) {
            addCriterion("dmsms like", value, "dmsms");
            return (Criteria) this;
        }

        public Criteria andDmsmsNotLike(String value) {
            addCriterion("dmsms not like", value, "dmsms");
            return (Criteria) this;
        }

        public Criteria andDmsmsIn(List<String> values) {
            addCriterion("dmsms in", values, "dmsms");
            return (Criteria) this;
        }

        public Criteria andDmsmsNotIn(List<String> values) {
            addCriterion("dmsms not in", values, "dmsms");
            return (Criteria) this;
        }

        public Criteria andDmsmsBetween(String value1, String value2) {
            addCriterion("dmsms between", value1, value2, "dmsms");
            return (Criteria) this;
        }

        public Criteria andDmsmsNotBetween(String value1, String value2) {
            addCriterion("dmsms not between", value1, value2, "dmsms");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsIsNull() {
            addCriterion("dmhqsms is null");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsIsNotNull() {
            addCriterion("dmhqsms is not null");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsEqualTo(String value) {
            addCriterion("dmhqsms =", value, "dmhqsms");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsNotEqualTo(String value) {
            addCriterion("dmhqsms <>", value, "dmhqsms");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsGreaterThan(String value) {
            addCriterion("dmhqsms >", value, "dmhqsms");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsGreaterThanOrEqualTo(String value) {
            addCriterion("dmhqsms >=", value, "dmhqsms");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsLessThan(String value) {
            addCriterion("dmhqsms <", value, "dmhqsms");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsLessThanOrEqualTo(String value) {
            addCriterion("dmhqsms <=", value, "dmhqsms");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsLike(String value) {
            addCriterion("dmhqsms like", value, "dmhqsms");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsNotLike(String value) {
            addCriterion("dmhqsms not like", value, "dmhqsms");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsIn(List<String> values) {
            addCriterion("dmhqsms in", values, "dmhqsms");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsNotIn(List<String> values) {
            addCriterion("dmhqsms not in", values, "dmhqsms");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsBetween(String value1, String value2) {
            addCriterion("dmhqsms between", value1, value2, "dmhqsms");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsNotBetween(String value1, String value2) {
            addCriterion("dmhqsms not between", value1, value2, "dmhqsms");
            return (Criteria) this;
        }

        public Criteria andTelecomskyIsNull() {
            addCriterion("telecomsky is null");
            return (Criteria) this;
        }

        public Criteria andTelecomskyIsNotNull() {
            addCriterion("telecomsky is not null");
            return (Criteria) this;
        }

        public Criteria andTelecomskyEqualTo(String value) {
            addCriterion("telecomsky =", value, "telecomsky");
            return (Criteria) this;
        }

        public Criteria andTelecomskyNotEqualTo(String value) {
            addCriterion("telecomsky <>", value, "telecomsky");
            return (Criteria) this;
        }

        public Criteria andTelecomskyGreaterThan(String value) {
            addCriterion("telecomsky >", value, "telecomsky");
            return (Criteria) this;
        }

        public Criteria andTelecomskyGreaterThanOrEqualTo(String value) {
            addCriterion("telecomsky >=", value, "telecomsky");
            return (Criteria) this;
        }

        public Criteria andTelecomskyLessThan(String value) {
            addCriterion("telecomsky <", value, "telecomsky");
            return (Criteria) this;
        }

        public Criteria andTelecomskyLessThanOrEqualTo(String value) {
            addCriterion("telecomsky <=", value, "telecomsky");
            return (Criteria) this;
        }

        public Criteria andTelecomskyLike(String value) {
            addCriterion("telecomsky like", value, "telecomsky");
            return (Criteria) this;
        }

        public Criteria andTelecomskyNotLike(String value) {
            addCriterion("telecomsky not like", value, "telecomsky");
            return (Criteria) this;
        }

        public Criteria andTelecomskyIn(List<String> values) {
            addCriterion("telecomsky in", values, "telecomsky");
            return (Criteria) this;
        }

        public Criteria andTelecomskyNotIn(List<String> values) {
            addCriterion("telecomsky not in", values, "telecomsky");
            return (Criteria) this;
        }

        public Criteria andTelecomskyBetween(String value1, String value2) {
            addCriterion("telecomsky between", value1, value2, "telecomsky");
            return (Criteria) this;
        }

        public Criteria andTelecomskyNotBetween(String value1, String value2) {
            addCriterion("telecomsky not between", value1, value2, "telecomsky");
            return (Criteria) this;
        }

        public Criteria andTelecomwingIsNull() {
            addCriterion("telecomwing is null");
            return (Criteria) this;
        }

        public Criteria andTelecomwingIsNotNull() {
            addCriterion("telecomwing is not null");
            return (Criteria) this;
        }

        public Criteria andTelecomwingEqualTo(String value) {
            addCriterion("telecomwing =", value, "telecomwing");
            return (Criteria) this;
        }

        public Criteria andTelecomwingNotEqualTo(String value) {
            addCriterion("telecomwing <>", value, "telecomwing");
            return (Criteria) this;
        }

        public Criteria andTelecomwingGreaterThan(String value) {
            addCriterion("telecomwing >", value, "telecomwing");
            return (Criteria) this;
        }

        public Criteria andTelecomwingGreaterThanOrEqualTo(String value) {
            addCriterion("telecomwing >=", value, "telecomwing");
            return (Criteria) this;
        }

        public Criteria andTelecomwingLessThan(String value) {
            addCriterion("telecomwing <", value, "telecomwing");
            return (Criteria) this;
        }

        public Criteria andTelecomwingLessThanOrEqualTo(String value) {
            addCriterion("telecomwing <=", value, "telecomwing");
            return (Criteria) this;
        }

        public Criteria andTelecomwingLike(String value) {
            addCriterion("telecomwing like", value, "telecomwing");
            return (Criteria) this;
        }

        public Criteria andTelecomwingNotLike(String value) {
            addCriterion("telecomwing not like", value, "telecomwing");
            return (Criteria) this;
        }

        public Criteria andTelecomwingIn(List<String> values) {
            addCriterion("telecomwing in", values, "telecomwing");
            return (Criteria) this;
        }

        public Criteria andTelecomwingNotIn(List<String> values) {
            addCriterion("telecomwing not in", values, "telecomwing");
            return (Criteria) this;
        }

        public Criteria andTelecomwingBetween(String value1, String value2) {
            addCriterion("telecomwing between", value1, value2, "telecomwing");
            return (Criteria) this;
        }

        public Criteria andTelecomwingNotBetween(String value1, String value2) {
            addCriterion("telecomwing not between", value1, value2, "telecomwing");
            return (Criteria) this;
        }

        public Criteria andUnicomgdIsNull() {
            addCriterion("unicomGD is null");
            return (Criteria) this;
        }

        public Criteria andUnicomgdIsNotNull() {
            addCriterion("unicomGD is not null");
            return (Criteria) this;
        }

        public Criteria andUnicomgdEqualTo(String value) {
            addCriterion("unicomGD =", value, "unicomgd");
            return (Criteria) this;
        }

        public Criteria andUnicomgdNotEqualTo(String value) {
            addCriterion("unicomGD <>", value, "unicomgd");
            return (Criteria) this;
        }

        public Criteria andUnicomgdGreaterThan(String value) {
            addCriterion("unicomGD >", value, "unicomgd");
            return (Criteria) this;
        }

        public Criteria andUnicomgdGreaterThanOrEqualTo(String value) {
            addCriterion("unicomGD >=", value, "unicomgd");
            return (Criteria) this;
        }

        public Criteria andUnicomgdLessThan(String value) {
            addCriterion("unicomGD <", value, "unicomgd");
            return (Criteria) this;
        }

        public Criteria andUnicomgdLessThanOrEqualTo(String value) {
            addCriterion("unicomGD <=", value, "unicomgd");
            return (Criteria) this;
        }

        public Criteria andUnicomgdLike(String value) {
            addCriterion("unicomGD like", value, "unicomgd");
            return (Criteria) this;
        }

        public Criteria andUnicomgdNotLike(String value) {
            addCriterion("unicomGD not like", value, "unicomgd");
            return (Criteria) this;
        }

        public Criteria andUnicomgdIn(List<String> values) {
            addCriterion("unicomGD in", values, "unicomgd");
            return (Criteria) this;
        }

        public Criteria andUnicomgdNotIn(List<String> values) {
            addCriterion("unicomGD not in", values, "unicomgd");
            return (Criteria) this;
        }

        public Criteria andUnicomgdBetween(String value1, String value2) {
            addCriterion("unicomGD between", value1, value2, "unicomgd");
            return (Criteria) this;
        }

        public Criteria andUnicomgdNotBetween(String value1, String value2) {
            addCriterion("unicomGD not between", value1, value2, "unicomgd");
            return (Criteria) this;
        }

        public Criteria andTelecomsfIsNull() {
            addCriterion("telecomsf is null");
            return (Criteria) this;
        }

        public Criteria andTelecomsfIsNotNull() {
            addCriterion("telecomsf is not null");
            return (Criteria) this;
        }

        public Criteria andTelecomsfEqualTo(String value) {
            addCriterion("telecomsf =", value, "telecomsf");
            return (Criteria) this;
        }

        public Criteria andTelecomsfNotEqualTo(String value) {
            addCriterion("telecomsf <>", value, "telecomsf");
            return (Criteria) this;
        }

        public Criteria andTelecomsfGreaterThan(String value) {
            addCriterion("telecomsf >", value, "telecomsf");
            return (Criteria) this;
        }

        public Criteria andTelecomsfGreaterThanOrEqualTo(String value) {
            addCriterion("telecomsf >=", value, "telecomsf");
            return (Criteria) this;
        }

        public Criteria andTelecomsfLessThan(String value) {
            addCriterion("telecomsf <", value, "telecomsf");
            return (Criteria) this;
        }

        public Criteria andTelecomsfLessThanOrEqualTo(String value) {
            addCriterion("telecomsf <=", value, "telecomsf");
            return (Criteria) this;
        }

        public Criteria andTelecomsfLike(String value) {
            addCriterion("telecomsf like", value, "telecomsf");
            return (Criteria) this;
        }

        public Criteria andTelecomsfNotLike(String value) {
            addCriterion("telecomsf not like", value, "telecomsf");
            return (Criteria) this;
        }

        public Criteria andTelecomsfIn(List<String> values) {
            addCriterion("telecomsf in", values, "telecomsf");
            return (Criteria) this;
        }

        public Criteria andTelecomsfNotIn(List<String> values) {
            addCriterion("telecomsf not in", values, "telecomsf");
            return (Criteria) this;
        }

        public Criteria andTelecomsfBetween(String value1, String value2) {
            addCriterion("telecomsf between", value1, value2, "telecomsf");
            return (Criteria) this;
        }

        public Criteria andTelecomsfNotBetween(String value1, String value2) {
            addCriterion("telecomsf not between", value1, value2, "telecomsf");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaIsNull() {
            addCriterion("telecomskySA is null");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaIsNotNull() {
            addCriterion("telecomskySA is not null");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaEqualTo(String value) {
            addCriterion("telecomskySA =", value, "telecomskysa");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaNotEqualTo(String value) {
            addCriterion("telecomskySA <>", value, "telecomskysa");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaGreaterThan(String value) {
            addCriterion("telecomskySA >", value, "telecomskysa");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaGreaterThanOrEqualTo(String value) {
            addCriterion("telecomskySA >=", value, "telecomskysa");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaLessThan(String value) {
            addCriterion("telecomskySA <", value, "telecomskysa");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaLessThanOrEqualTo(String value) {
            addCriterion("telecomskySA <=", value, "telecomskysa");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaLike(String value) {
            addCriterion("telecomskySA like", value, "telecomskysa");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaNotLike(String value) {
            addCriterion("telecomskySA not like", value, "telecomskysa");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaIn(List<String> values) {
            addCriterion("telecomskySA in", values, "telecomskysa");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaNotIn(List<String> values) {
            addCriterion("telecomskySA not in", values, "telecomskysa");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaBetween(String value1, String value2) {
            addCriterion("telecomskySA between", value1, value2, "telecomskysa");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaNotBetween(String value1, String value2) {
            addCriterion("telecomskySA not between", value1, value2, "telecomskysa");
            return (Criteria) this;
        }

        public Criteria andUmSwitchIsNull() {
            addCriterion("um_switch is null");
            return (Criteria) this;
        }

        public Criteria andUmSwitchIsNotNull() {
            addCriterion("um_switch is not null");
            return (Criteria) this;
        }

        public Criteria andUmSwitchEqualTo(String value) {
            addCriterion("um_switch =", value, "umSwitch");
            return (Criteria) this;
        }

        public Criteria andUmSwitchNotEqualTo(String value) {
            addCriterion("um_switch <>", value, "umSwitch");
            return (Criteria) this;
        }

        public Criteria andUmSwitchGreaterThan(String value) {
            addCriterion("um_switch >", value, "umSwitch");
            return (Criteria) this;
        }

        public Criteria andUmSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("um_switch >=", value, "umSwitch");
            return (Criteria) this;
        }

        public Criteria andUmSwitchLessThan(String value) {
            addCriterion("um_switch <", value, "umSwitch");
            return (Criteria) this;
        }

        public Criteria andUmSwitchLessThanOrEqualTo(String value) {
            addCriterion("um_switch <=", value, "umSwitch");
            return (Criteria) this;
        }

        public Criteria andUmSwitchLike(String value) {
            addCriterion("um_switch like", value, "umSwitch");
            return (Criteria) this;
        }

        public Criteria andUmSwitchNotLike(String value) {
            addCriterion("um_switch not like", value, "umSwitch");
            return (Criteria) this;
        }

        public Criteria andUmSwitchIn(List<String> values) {
            addCriterion("um_switch in", values, "umSwitch");
            return (Criteria) this;
        }

        public Criteria andUmSwitchNotIn(List<String> values) {
            addCriterion("um_switch not in", values, "umSwitch");
            return (Criteria) this;
        }

        public Criteria andUmSwitchBetween(String value1, String value2) {
            addCriterion("um_switch between", value1, value2, "umSwitch");
            return (Criteria) this;
        }

        public Criteria andUmSwitchNotBetween(String value1, String value2) {
            addCriterion("um_switch not between", value1, value2, "umSwitch");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchIsNull() {
            addCriterion("ddo_switch is null");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchIsNotNull() {
            addCriterion("ddo_switch is not null");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchEqualTo(String value) {
            addCriterion("ddo_switch =", value, "ddoSwitch");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchNotEqualTo(String value) {
            addCriterion("ddo_switch <>", value, "ddoSwitch");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchGreaterThan(String value) {
            addCriterion("ddo_switch >", value, "ddoSwitch");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("ddo_switch >=", value, "ddoSwitch");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchLessThan(String value) {
            addCriterion("ddo_switch <", value, "ddoSwitch");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchLessThanOrEqualTo(String value) {
            addCriterion("ddo_switch <=", value, "ddoSwitch");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchLike(String value) {
            addCriterion("ddo_switch like", value, "ddoSwitch");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchNotLike(String value) {
            addCriterion("ddo_switch not like", value, "ddoSwitch");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchIn(List<String> values) {
            addCriterion("ddo_switch in", values, "ddoSwitch");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchNotIn(List<String> values) {
            addCriterion("ddo_switch not in", values, "ddoSwitch");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchBetween(String value1, String value2) {
            addCriterion("ddo_switch between", value1, value2, "ddoSwitch");
            return (Criteria) this;
        }

        public Criteria andDdoSwitchNotBetween(String value1, String value2) {
            addCriterion("ddo_switch not between", value1, value2, "ddoSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchIsNull() {
            addCriterion("unicom_switch is null");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchIsNotNull() {
            addCriterion("unicom_switch is not null");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchEqualTo(String value) {
            addCriterion("unicom_switch =", value, "unicomSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchNotEqualTo(String value) {
            addCriterion("unicom_switch <>", value, "unicomSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchGreaterThan(String value) {
            addCriterion("unicom_switch >", value, "unicomSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("unicom_switch >=", value, "unicomSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchLessThan(String value) {
            addCriterion("unicom_switch <", value, "unicomSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchLessThanOrEqualTo(String value) {
            addCriterion("unicom_switch <=", value, "unicomSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchLike(String value) {
            addCriterion("unicom_switch like", value, "unicomSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchNotLike(String value) {
            addCriterion("unicom_switch not like", value, "unicomSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchIn(List<String> values) {
            addCriterion("unicom_switch in", values, "unicomSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchNotIn(List<String> values) {
            addCriterion("unicom_switch not in", values, "unicomSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchBetween(String value1, String value2) {
            addCriterion("unicom_switch between", value1, value2, "unicomSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomSwitchNotBetween(String value1, String value2) {
            addCriterion("unicom_switch not between", value1, value2, "unicomSwitch");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchIsNull() {
            addCriterion("tele_switch is null");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchIsNotNull() {
            addCriterion("tele_switch is not null");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchEqualTo(String value) {
            addCriterion("tele_switch =", value, "teleSwitch");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchNotEqualTo(String value) {
            addCriterion("tele_switch <>", value, "teleSwitch");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchGreaterThan(String value) {
            addCriterion("tele_switch >", value, "teleSwitch");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("tele_switch >=", value, "teleSwitch");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchLessThan(String value) {
            addCriterion("tele_switch <", value, "teleSwitch");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchLessThanOrEqualTo(String value) {
            addCriterion("tele_switch <=", value, "teleSwitch");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchLike(String value) {
            addCriterion("tele_switch like", value, "teleSwitch");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchNotLike(String value) {
            addCriterion("tele_switch not like", value, "teleSwitch");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchIn(List<String> values) {
            addCriterion("tele_switch in", values, "teleSwitch");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchNotIn(List<String> values) {
            addCriterion("tele_switch not in", values, "teleSwitch");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchBetween(String value1, String value2) {
            addCriterion("tele_switch between", value1, value2, "teleSwitch");
            return (Criteria) this;
        }

        public Criteria andTeleSwitchNotBetween(String value1, String value2) {
            addCriterion("tele_switch not between", value1, value2, "teleSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchIsNull() {
            addCriterion("unicomMusic_switch is null");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchIsNotNull() {
            addCriterion("unicomMusic_switch is not null");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchEqualTo(String value) {
            addCriterion("unicomMusic_switch =", value, "unicommusicSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchNotEqualTo(String value) {
            addCriterion("unicomMusic_switch <>", value, "unicommusicSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchGreaterThan(String value) {
            addCriterion("unicomMusic_switch >", value, "unicommusicSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("unicomMusic_switch >=", value, "unicommusicSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchLessThan(String value) {
            addCriterion("unicomMusic_switch <", value, "unicommusicSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchLessThanOrEqualTo(String value) {
            addCriterion("unicomMusic_switch <=", value, "unicommusicSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchLike(String value) {
            addCriterion("unicomMusic_switch like", value, "unicommusicSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchNotLike(String value) {
            addCriterion("unicomMusic_switch not like", value, "unicommusicSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchIn(List<String> values) {
            addCriterion("unicomMusic_switch in", values, "unicommusicSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchNotIn(List<String> values) {
            addCriterion("unicomMusic_switch not in", values, "unicommusicSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchBetween(String value1, String value2) {
            addCriterion("unicomMusic_switch between", value1, value2, "unicommusicSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicommusicSwitchNotBetween(String value1, String value2) {
            addCriterion("unicomMusic_switch not between", value1, value2, "unicommusicSwitch");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchIsNull() {
            addCriterion("dmsms_switch is null");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchIsNotNull() {
            addCriterion("dmsms_switch is not null");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchEqualTo(String value) {
            addCriterion("dmsms_switch =", value, "dmsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchNotEqualTo(String value) {
            addCriterion("dmsms_switch <>", value, "dmsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchGreaterThan(String value) {
            addCriterion("dmsms_switch >", value, "dmsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("dmsms_switch >=", value, "dmsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchLessThan(String value) {
            addCriterion("dmsms_switch <", value, "dmsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchLessThanOrEqualTo(String value) {
            addCriterion("dmsms_switch <=", value, "dmsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchLike(String value) {
            addCriterion("dmsms_switch like", value, "dmsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchNotLike(String value) {
            addCriterion("dmsms_switch not like", value, "dmsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchIn(List<String> values) {
            addCriterion("dmsms_switch in", values, "dmsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchNotIn(List<String> values) {
            addCriterion("dmsms_switch not in", values, "dmsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchBetween(String value1, String value2) {
            addCriterion("dmsms_switch between", value1, value2, "dmsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmsmsSwitchNotBetween(String value1, String value2) {
            addCriterion("dmsms_switch not between", value1, value2, "dmsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchIsNull() {
            addCriterion("dmhqsms_switch is null");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchIsNotNull() {
            addCriterion("dmhqsms_switch is not null");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchEqualTo(String value) {
            addCriterion("dmhqsms_switch =", value, "dmhqsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchNotEqualTo(String value) {
            addCriterion("dmhqsms_switch <>", value, "dmhqsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchGreaterThan(String value) {
            addCriterion("dmhqsms_switch >", value, "dmhqsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("dmhqsms_switch >=", value, "dmhqsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchLessThan(String value) {
            addCriterion("dmhqsms_switch <", value, "dmhqsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchLessThanOrEqualTo(String value) {
            addCriterion("dmhqsms_switch <=", value, "dmhqsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchLike(String value) {
            addCriterion("dmhqsms_switch like", value, "dmhqsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchNotLike(String value) {
            addCriterion("dmhqsms_switch not like", value, "dmhqsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchIn(List<String> values) {
            addCriterion("dmhqsms_switch in", values, "dmhqsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchNotIn(List<String> values) {
            addCriterion("dmhqsms_switch not in", values, "dmhqsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchBetween(String value1, String value2) {
            addCriterion("dmhqsms_switch between", value1, value2, "dmhqsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andDmhqsmsSwitchNotBetween(String value1, String value2) {
            addCriterion("dmhqsms_switch not between", value1, value2, "dmhqsmsSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchIsNull() {
            addCriterion("telecomkey_switch is null");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchIsNotNull() {
            addCriterion("telecomkey_switch is not null");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchEqualTo(String value) {
            addCriterion("telecomkey_switch =", value, "telecomkeySwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchNotEqualTo(String value) {
            addCriterion("telecomkey_switch <>", value, "telecomkeySwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchGreaterThan(String value) {
            addCriterion("telecomkey_switch >", value, "telecomkeySwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchGreaterThanOrEqualTo(String value) {
            addCriterion("telecomkey_switch >=", value, "telecomkeySwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchLessThan(String value) {
            addCriterion("telecomkey_switch <", value, "telecomkeySwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchLessThanOrEqualTo(String value) {
            addCriterion("telecomkey_switch <=", value, "telecomkeySwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchLike(String value) {
            addCriterion("telecomkey_switch like", value, "telecomkeySwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchNotLike(String value) {
            addCriterion("telecomkey_switch not like", value, "telecomkeySwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchIn(List<String> values) {
            addCriterion("telecomkey_switch in", values, "telecomkeySwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchNotIn(List<String> values) {
            addCriterion("telecomkey_switch not in", values, "telecomkeySwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchBetween(String value1, String value2) {
            addCriterion("telecomkey_switch between", value1, value2, "telecomkeySwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomkeySwitchNotBetween(String value1, String value2) {
            addCriterion("telecomkey_switch not between", value1, value2, "telecomkeySwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchIsNull() {
            addCriterion("telecomwing_switch is null");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchIsNotNull() {
            addCriterion("telecomwing_switch is not null");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchEqualTo(String value) {
            addCriterion("telecomwing_switch =", value, "telecomwingSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchNotEqualTo(String value) {
            addCriterion("telecomwing_switch <>", value, "telecomwingSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchGreaterThan(String value) {
            addCriterion("telecomwing_switch >", value, "telecomwingSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("telecomwing_switch >=", value, "telecomwingSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchLessThan(String value) {
            addCriterion("telecomwing_switch <", value, "telecomwingSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchLessThanOrEqualTo(String value) {
            addCriterion("telecomwing_switch <=", value, "telecomwingSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchLike(String value) {
            addCriterion("telecomwing_switch like", value, "telecomwingSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchNotLike(String value) {
            addCriterion("telecomwing_switch not like", value, "telecomwingSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchIn(List<String> values) {
            addCriterion("telecomwing_switch in", values, "telecomwingSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchNotIn(List<String> values) {
            addCriterion("telecomwing_switch not in", values, "telecomwingSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchBetween(String value1, String value2) {
            addCriterion("telecomwing_switch between", value1, value2, "telecomwingSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomwingSwitchNotBetween(String value1, String value2) {
            addCriterion("telecomwing_switch not between", value1, value2, "telecomwingSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchIsNull() {
            addCriterion("unicomGD_switch is null");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchIsNotNull() {
            addCriterion("unicomGD_switch is not null");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchEqualTo(String value) {
            addCriterion("unicomGD_switch =", value, "unicomgdSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchNotEqualTo(String value) {
            addCriterion("unicomGD_switch <>", value, "unicomgdSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchGreaterThan(String value) {
            addCriterion("unicomGD_switch >", value, "unicomgdSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("unicomGD_switch >=", value, "unicomgdSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchLessThan(String value) {
            addCriterion("unicomGD_switch <", value, "unicomgdSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchLessThanOrEqualTo(String value) {
            addCriterion("unicomGD_switch <=", value, "unicomgdSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchLike(String value) {
            addCriterion("unicomGD_switch like", value, "unicomgdSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchNotLike(String value) {
            addCriterion("unicomGD_switch not like", value, "unicomgdSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchIn(List<String> values) {
            addCriterion("unicomGD_switch in", values, "unicomgdSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchNotIn(List<String> values) {
            addCriterion("unicomGD_switch not in", values, "unicomgdSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchBetween(String value1, String value2) {
            addCriterion("unicomGD_switch between", value1, value2, "unicomgdSwitch");
            return (Criteria) this;
        }

        public Criteria andUnicomgdSwitchNotBetween(String value1, String value2) {
            addCriterion("unicomGD_switch not between", value1, value2, "unicomgdSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchIsNull() {
            addCriterion("telecomskySA_switch is null");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchIsNotNull() {
            addCriterion("telecomskySA_switch is not null");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchEqualTo(String value) {
            addCriterion("telecomskySA_switch =", value, "telecomskysaSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchNotEqualTo(String value) {
            addCriterion("telecomskySA_switch <>", value, "telecomskysaSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchGreaterThan(String value) {
            addCriterion("telecomskySA_switch >", value, "telecomskysaSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("telecomskySA_switch >=", value, "telecomskysaSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchLessThan(String value) {
            addCriterion("telecomskySA_switch <", value, "telecomskysaSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchLessThanOrEqualTo(String value) {
            addCriterion("telecomskySA_switch <=", value, "telecomskysaSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchLike(String value) {
            addCriterion("telecomskySA_switch like", value, "telecomskysaSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchNotLike(String value) {
            addCriterion("telecomskySA_switch not like", value, "telecomskysaSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchIn(List<String> values) {
            addCriterion("telecomskySA_switch in", values, "telecomskysaSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchNotIn(List<String> values) {
            addCriterion("telecomskySA_switch not in", values, "telecomskysaSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchBetween(String value1, String value2) {
            addCriterion("telecomskySA_switch between", value1, value2, "telecomskysaSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomskysaSwitchNotBetween(String value1, String value2) {
            addCriterion("telecomskySA_switch not between", value1, value2, "telecomskysaSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchIsNull() {
            addCriterion("telecomsf_switch is null");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchIsNotNull() {
            addCriterion("telecomsf_switch is not null");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchEqualTo(String value) {
            addCriterion("telecomsf_switch =", value, "telecomsfSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchNotEqualTo(String value) {
            addCriterion("telecomsf_switch <>", value, "telecomsfSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchGreaterThan(String value) {
            addCriterion("telecomsf_switch >", value, "telecomsfSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("telecomsf_switch >=", value, "telecomsfSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchLessThan(String value) {
            addCriterion("telecomsf_switch <", value, "telecomsfSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchLessThanOrEqualTo(String value) {
            addCriterion("telecomsf_switch <=", value, "telecomsfSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchLike(String value) {
            addCriterion("telecomsf_switch like", value, "telecomsfSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchNotLike(String value) {
            addCriterion("telecomsf_switch not like", value, "telecomsfSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchIn(List<String> values) {
            addCriterion("telecomsf_switch in", values, "telecomsfSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchNotIn(List<String> values) {
            addCriterion("telecomsf_switch not in", values, "telecomsfSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchBetween(String value1, String value2) {
            addCriterion("telecomsf_switch between", value1, value2, "telecomsfSwitch");
            return (Criteria) this;
        }

        public Criteria andTelecomsfSwitchNotBetween(String value1, String value2) {
            addCriterion("telecomsf_switch not between", value1, value2, "telecomsfSwitch");
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