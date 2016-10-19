package com.sql.bean;

import java.util.ArrayList;
import java.util.List;

public class TWimipayCodeCountInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWimipayCodeCountInfoExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCurrentnumIsNull() {
            addCriterion("currentnum is null");
            return (Criteria) this;
        }

        public Criteria andCurrentnumIsNotNull() {
            addCriterion("currentnum is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentnumEqualTo(Float value) {
            addCriterion("currentnum =", value, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumNotEqualTo(Float value) {
            addCriterion("currentnum <>", value, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumGreaterThan(Float value) {
            addCriterion("currentnum >", value, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumGreaterThanOrEqualTo(Float value) {
            addCriterion("currentnum >=", value, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumLessThan(Float value) {
            addCriterion("currentnum <", value, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumLessThanOrEqualTo(Float value) {
            addCriterion("currentnum <=", value, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumIn(List<Float> values) {
            addCriterion("currentnum in", values, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumNotIn(List<Float> values) {
            addCriterion("currentnum not in", values, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumBetween(Float value1, Float value2) {
            addCriterion("currentnum between", value1, value2, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumNotBetween(Float value1, Float value2) {
            addCriterion("currentnum not between", value1, value2, "currentnum");
            return (Criteria) this;
        }

        public Criteria andDeductednumIsNull() {
            addCriterion("deductednum is null");
            return (Criteria) this;
        }

        public Criteria andDeductednumIsNotNull() {
            addCriterion("deductednum is not null");
            return (Criteria) this;
        }

        public Criteria andDeductednumEqualTo(Float value) {
            addCriterion("deductednum =", value, "deductednum");
            return (Criteria) this;
        }

        public Criteria andDeductednumNotEqualTo(Float value) {
            addCriterion("deductednum <>", value, "deductednum");
            return (Criteria) this;
        }

        public Criteria andDeductednumGreaterThan(Float value) {
            addCriterion("deductednum >", value, "deductednum");
            return (Criteria) this;
        }

        public Criteria andDeductednumGreaterThanOrEqualTo(Float value) {
            addCriterion("deductednum >=", value, "deductednum");
            return (Criteria) this;
        }

        public Criteria andDeductednumLessThan(Float value) {
            addCriterion("deductednum <", value, "deductednum");
            return (Criteria) this;
        }

        public Criteria andDeductednumLessThanOrEqualTo(Float value) {
            addCriterion("deductednum <=", value, "deductednum");
            return (Criteria) this;
        }

        public Criteria andDeductednumIn(List<Float> values) {
            addCriterion("deductednum in", values, "deductednum");
            return (Criteria) this;
        }

        public Criteria andDeductednumNotIn(List<Float> values) {
            addCriterion("deductednum not in", values, "deductednum");
            return (Criteria) this;
        }

        public Criteria andDeductednumBetween(Float value1, Float value2) {
            addCriterion("deductednum between", value1, value2, "deductednum");
            return (Criteria) this;
        }

        public Criteria andDeductednumNotBetween(Float value1, Float value2) {
            addCriterion("deductednum not between", value1, value2, "deductednum");
            return (Criteria) this;
        }

        public Criteria andTopnumIsNull() {
            addCriterion("topnum is null");
            return (Criteria) this;
        }

        public Criteria andTopnumIsNotNull() {
            addCriterion("topnum is not null");
            return (Criteria) this;
        }

        public Criteria andTopnumEqualTo(Float value) {
            addCriterion("topnum =", value, "topnum");
            return (Criteria) this;
        }

        public Criteria andTopnumNotEqualTo(Float value) {
            addCriterion("topnum <>", value, "topnum");
            return (Criteria) this;
        }

        public Criteria andTopnumGreaterThan(Float value) {
            addCriterion("topnum >", value, "topnum");
            return (Criteria) this;
        }

        public Criteria andTopnumGreaterThanOrEqualTo(Float value) {
            addCriterion("topnum >=", value, "topnum");
            return (Criteria) this;
        }

        public Criteria andTopnumLessThan(Float value) {
            addCriterion("topnum <", value, "topnum");
            return (Criteria) this;
        }

        public Criteria andTopnumLessThanOrEqualTo(Float value) {
            addCriterion("topnum <=", value, "topnum");
            return (Criteria) this;
        }

        public Criteria andTopnumIn(List<Float> values) {
            addCriterion("topnum in", values, "topnum");
            return (Criteria) this;
        }

        public Criteria andTopnumNotIn(List<Float> values) {
            addCriterion("topnum not in", values, "topnum");
            return (Criteria) this;
        }

        public Criteria andTopnumBetween(Float value1, Float value2) {
            addCriterion("topnum between", value1, value2, "topnum");
            return (Criteria) this;
        }

        public Criteria andTopnumNotBetween(Float value1, Float value2) {
            addCriterion("topnum not between", value1, value2, "topnum");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Boolean value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Boolean value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Boolean value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Boolean value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Boolean value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Boolean> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Boolean> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Boolean value1, Boolean value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andDoublepayrateIsNull() {
            addCriterion("doublepayrate is null");
            return (Criteria) this;
        }

        public Criteria andDoublepayrateIsNotNull() {
            addCriterion("doublepayrate is not null");
            return (Criteria) this;
        }

        public Criteria andDoublepayrateEqualTo(Float value) {
            addCriterion("doublepayrate =", value, "doublepayrate");
            return (Criteria) this;
        }

        public Criteria andDoublepayrateNotEqualTo(Float value) {
            addCriterion("doublepayrate <>", value, "doublepayrate");
            return (Criteria) this;
        }

        public Criteria andDoublepayrateGreaterThan(Float value) {
            addCriterion("doublepayrate >", value, "doublepayrate");
            return (Criteria) this;
        }

        public Criteria andDoublepayrateGreaterThanOrEqualTo(Float value) {
            addCriterion("doublepayrate >=", value, "doublepayrate");
            return (Criteria) this;
        }

        public Criteria andDoublepayrateLessThan(Float value) {
            addCriterion("doublepayrate <", value, "doublepayrate");
            return (Criteria) this;
        }

        public Criteria andDoublepayrateLessThanOrEqualTo(Float value) {
            addCriterion("doublepayrate <=", value, "doublepayrate");
            return (Criteria) this;
        }

        public Criteria andDoublepayrateIn(List<Float> values) {
            addCriterion("doublepayrate in", values, "doublepayrate");
            return (Criteria) this;
        }

        public Criteria andDoublepayrateNotIn(List<Float> values) {
            addCriterion("doublepayrate not in", values, "doublepayrate");
            return (Criteria) this;
        }

        public Criteria andDoublepayrateBetween(Float value1, Float value2) {
            addCriterion("doublepayrate between", value1, value2, "doublepayrate");
            return (Criteria) this;
        }

        public Criteria andDoublepayrateNotBetween(Float value1, Float value2) {
            addCriterion("doublepayrate not between", value1, value2, "doublepayrate");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Float value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Float value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Float value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Float value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Float value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Float value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Float> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Float> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Float value1, Float value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Float value1, Float value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andNextdaystateIsNull() {
            addCriterion("nextdaystate is null");
            return (Criteria) this;
        }

        public Criteria andNextdaystateIsNotNull() {
            addCriterion("nextdaystate is not null");
            return (Criteria) this;
        }

        public Criteria andNextdaystateEqualTo(Boolean value) {
            addCriterion("nextdaystate =", value, "nextdaystate");
            return (Criteria) this;
        }

        public Criteria andNextdaystateNotEqualTo(Boolean value) {
            addCriterion("nextdaystate <>", value, "nextdaystate");
            return (Criteria) this;
        }

        public Criteria andNextdaystateGreaterThan(Boolean value) {
            addCriterion("nextdaystate >", value, "nextdaystate");
            return (Criteria) this;
        }

        public Criteria andNextdaystateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("nextdaystate >=", value, "nextdaystate");
            return (Criteria) this;
        }

        public Criteria andNextdaystateLessThan(Boolean value) {
            addCriterion("nextdaystate <", value, "nextdaystate");
            return (Criteria) this;
        }

        public Criteria andNextdaystateLessThanOrEqualTo(Boolean value) {
            addCriterion("nextdaystate <=", value, "nextdaystate");
            return (Criteria) this;
        }

        public Criteria andNextdaystateIn(List<Boolean> values) {
            addCriterion("nextdaystate in", values, "nextdaystate");
            return (Criteria) this;
        }

        public Criteria andNextdaystateNotIn(List<Boolean> values) {
            addCriterion("nextdaystate not in", values, "nextdaystate");
            return (Criteria) this;
        }

        public Criteria andNextdaystateBetween(Boolean value1, Boolean value2) {
            addCriterion("nextdaystate between", value1, value2, "nextdaystate");
            return (Criteria) this;
        }

        public Criteria andNextdaystateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("nextdaystate not between", value1, value2, "nextdaystate");
            return (Criteria) this;
        }

        public Criteria andNextdaytopnumIsNull() {
            addCriterion("nextdaytopnum is null");
            return (Criteria) this;
        }

        public Criteria andNextdaytopnumIsNotNull() {
            addCriterion("nextdaytopnum is not null");
            return (Criteria) this;
        }

        public Criteria andNextdaytopnumEqualTo(Float value) {
            addCriterion("nextdaytopnum =", value, "nextdaytopnum");
            return (Criteria) this;
        }

        public Criteria andNextdaytopnumNotEqualTo(Float value) {
            addCriterion("nextdaytopnum <>", value, "nextdaytopnum");
            return (Criteria) this;
        }

        public Criteria andNextdaytopnumGreaterThan(Float value) {
            addCriterion("nextdaytopnum >", value, "nextdaytopnum");
            return (Criteria) this;
        }

        public Criteria andNextdaytopnumGreaterThanOrEqualTo(Float value) {
            addCriterion("nextdaytopnum >=", value, "nextdaytopnum");
            return (Criteria) this;
        }

        public Criteria andNextdaytopnumLessThan(Float value) {
            addCriterion("nextdaytopnum <", value, "nextdaytopnum");
            return (Criteria) this;
        }

        public Criteria andNextdaytopnumLessThanOrEqualTo(Float value) {
            addCriterion("nextdaytopnum <=", value, "nextdaytopnum");
            return (Criteria) this;
        }

        public Criteria andNextdaytopnumIn(List<Float> values) {
            addCriterion("nextdaytopnum in", values, "nextdaytopnum");
            return (Criteria) this;
        }

        public Criteria andNextdaytopnumNotIn(List<Float> values) {
            addCriterion("nextdaytopnum not in", values, "nextdaytopnum");
            return (Criteria) this;
        }

        public Criteria andNextdaytopnumBetween(Float value1, Float value2) {
            addCriterion("nextdaytopnum between", value1, value2, "nextdaytopnum");
            return (Criteria) this;
        }

        public Criteria andNextdaytopnumNotBetween(Float value1, Float value2) {
            addCriterion("nextdaytopnum not between", value1, value2, "nextdaytopnum");
            return (Criteria) this;
        }

        public Criteria andNextdayrateIsNull() {
            addCriterion("nextdayrate is null");
            return (Criteria) this;
        }

        public Criteria andNextdayrateIsNotNull() {
            addCriterion("nextdayrate is not null");
            return (Criteria) this;
        }

        public Criteria andNextdayrateEqualTo(Float value) {
            addCriterion("nextdayrate =", value, "nextdayrate");
            return (Criteria) this;
        }

        public Criteria andNextdayrateNotEqualTo(Float value) {
            addCriterion("nextdayrate <>", value, "nextdayrate");
            return (Criteria) this;
        }

        public Criteria andNextdayrateGreaterThan(Float value) {
            addCriterion("nextdayrate >", value, "nextdayrate");
            return (Criteria) this;
        }

        public Criteria andNextdayrateGreaterThanOrEqualTo(Float value) {
            addCriterion("nextdayrate >=", value, "nextdayrate");
            return (Criteria) this;
        }

        public Criteria andNextdayrateLessThan(Float value) {
            addCriterion("nextdayrate <", value, "nextdayrate");
            return (Criteria) this;
        }

        public Criteria andNextdayrateLessThanOrEqualTo(Float value) {
            addCriterion("nextdayrate <=", value, "nextdayrate");
            return (Criteria) this;
        }

        public Criteria andNextdayrateIn(List<Float> values) {
            addCriterion("nextdayrate in", values, "nextdayrate");
            return (Criteria) this;
        }

        public Criteria andNextdayrateNotIn(List<Float> values) {
            addCriterion("nextdayrate not in", values, "nextdayrate");
            return (Criteria) this;
        }

        public Criteria andNextdayrateBetween(Float value1, Float value2) {
            addCriterion("nextdayrate between", value1, value2, "nextdayrate");
            return (Criteria) this;
        }

        public Criteria andNextdayrateNotBetween(Float value1, Float value2) {
            addCriterion("nextdayrate not between", value1, value2, "nextdayrate");
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