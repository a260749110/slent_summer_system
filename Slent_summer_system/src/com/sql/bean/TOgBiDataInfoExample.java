package com.sql.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOgBiDataInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOgBiDataInfoExample() {
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

        public Criteria andBNameIsNull() {
            addCriterion("b_name is null");
            return (Criteria) this;
        }

        public Criteria andBNameIsNotNull() {
            addCriterion("b_name is not null");
            return (Criteria) this;
        }

        public Criteria andBNameEqualTo(String value) {
            addCriterion("b_name =", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotEqualTo(String value) {
            addCriterion("b_name <>", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThan(String value) {
            addCriterion("b_name >", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThanOrEqualTo(String value) {
            addCriterion("b_name >=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThan(String value) {
            addCriterion("b_name <", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThanOrEqualTo(String value) {
            addCriterion("b_name <=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLike(String value) {
            addCriterion("b_name like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotLike(String value) {
            addCriterion("b_name not like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameIn(List<String> values) {
            addCriterion("b_name in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotIn(List<String> values) {
            addCriterion("b_name not in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameBetween(String value1, String value2) {
            addCriterion("b_name between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotBetween(String value1, String value2) {
            addCriterion("b_name not between", value1, value2, "bName");
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

        public Criteria andImsiprovinceIsNull() {
            addCriterion("imsiprovince is null");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceIsNotNull() {
            addCriterion("imsiprovince is not null");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceEqualTo(String value) {
            addCriterion("imsiprovince =", value, "imsiprovince");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceNotEqualTo(String value) {
            addCriterion("imsiprovince <>", value, "imsiprovince");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceGreaterThan(String value) {
            addCriterion("imsiprovince >", value, "imsiprovince");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("imsiprovince >=", value, "imsiprovince");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceLessThan(String value) {
            addCriterion("imsiprovince <", value, "imsiprovince");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceLessThanOrEqualTo(String value) {
            addCriterion("imsiprovince <=", value, "imsiprovince");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceLike(String value) {
            addCriterion("imsiprovince like", value, "imsiprovince");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceNotLike(String value) {
            addCriterion("imsiprovince not like", value, "imsiprovince");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceIn(List<String> values) {
            addCriterion("imsiprovince in", values, "imsiprovince");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceNotIn(List<String> values) {
            addCriterion("imsiprovince not in", values, "imsiprovince");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceBetween(String value1, String value2) {
            addCriterion("imsiprovince between", value1, value2, "imsiprovince");
            return (Criteria) this;
        }

        public Criteria andImsiprovinceNotBetween(String value1, String value2) {
            addCriterion("imsiprovince not between", value1, value2, "imsiprovince");
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

        public Criteria andTruePriceIsNull() {
            addCriterion("true_price is null");
            return (Criteria) this;
        }

        public Criteria andTruePriceIsNotNull() {
            addCriterion("true_price is not null");
            return (Criteria) this;
        }

        public Criteria andTruePriceEqualTo(String value) {
            addCriterion("true_price =", value, "truePrice");
            return (Criteria) this;
        }

        public Criteria andTruePriceNotEqualTo(String value) {
            addCriterion("true_price <>", value, "truePrice");
            return (Criteria) this;
        }

        public Criteria andTruePriceGreaterThan(String value) {
            addCriterion("true_price >", value, "truePrice");
            return (Criteria) this;
        }

        public Criteria andTruePriceGreaterThanOrEqualTo(String value) {
            addCriterion("true_price >=", value, "truePrice");
            return (Criteria) this;
        }

        public Criteria andTruePriceLessThan(String value) {
            addCriterion("true_price <", value, "truePrice");
            return (Criteria) this;
        }

        public Criteria andTruePriceLessThanOrEqualTo(String value) {
            addCriterion("true_price <=", value, "truePrice");
            return (Criteria) this;
        }

        public Criteria andTruePriceLike(String value) {
            addCriterion("true_price like", value, "truePrice");
            return (Criteria) this;
        }

        public Criteria andTruePriceNotLike(String value) {
            addCriterion("true_price not like", value, "truePrice");
            return (Criteria) this;
        }

        public Criteria andTruePriceIn(List<String> values) {
            addCriterion("true_price in", values, "truePrice");
            return (Criteria) this;
        }

        public Criteria andTruePriceNotIn(List<String> values) {
            addCriterion("true_price not in", values, "truePrice");
            return (Criteria) this;
        }

        public Criteria andTruePriceBetween(String value1, String value2) {
            addCriterion("true_price between", value1, value2, "truePrice");
            return (Criteria) this;
        }

        public Criteria andTruePriceNotBetween(String value1, String value2) {
            addCriterion("true_price not between", value1, value2, "truePrice");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNull() {
            addCriterion("success is null");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNotNull() {
            addCriterion("success is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessEqualTo(Integer value) {
            addCriterion("success =", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotEqualTo(Integer value) {
            addCriterion("success <>", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThan(Integer value) {
            addCriterion("success >", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("success >=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThan(Integer value) {
            addCriterion("success <", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("success <=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessIn(List<Integer> values) {
            addCriterion("success in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotIn(List<Integer> values) {
            addCriterion("success not in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessBetween(Integer value1, Integer value2) {
            addCriterion("success between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("success not between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andFailIsNull() {
            addCriterion("fail is null");
            return (Criteria) this;
        }

        public Criteria andFailIsNotNull() {
            addCriterion("fail is not null");
            return (Criteria) this;
        }

        public Criteria andFailEqualTo(Integer value) {
            addCriterion("fail =", value, "fail");
            return (Criteria) this;
        }

        public Criteria andFailNotEqualTo(Integer value) {
            addCriterion("fail <>", value, "fail");
            return (Criteria) this;
        }

        public Criteria andFailGreaterThan(Integer value) {
            addCriterion("fail >", value, "fail");
            return (Criteria) this;
        }

        public Criteria andFailGreaterThanOrEqualTo(Integer value) {
            addCriterion("fail >=", value, "fail");
            return (Criteria) this;
        }

        public Criteria andFailLessThan(Integer value) {
            addCriterion("fail <", value, "fail");
            return (Criteria) this;
        }

        public Criteria andFailLessThanOrEqualTo(Integer value) {
            addCriterion("fail <=", value, "fail");
            return (Criteria) this;
        }

        public Criteria andFailIn(List<Integer> values) {
            addCriterion("fail in", values, "fail");
            return (Criteria) this;
        }

        public Criteria andFailNotIn(List<Integer> values) {
            addCriterion("fail not in", values, "fail");
            return (Criteria) this;
        }

        public Criteria andFailBetween(Integer value1, Integer value2) {
            addCriterion("fail between", value1, value2, "fail");
            return (Criteria) this;
        }

        public Criteria andFailNotBetween(Integer value1, Integer value2) {
            addCriterion("fail not between", value1, value2, "fail");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Integer value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Integer value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Integer value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Integer value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Integer value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Integer> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Integer> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Integer value1, Integer value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("channel not between", value1, value2, "channel");
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