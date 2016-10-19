package com.sql.bean;

import java.util.ArrayList;
import java.util.List;

public class TWimipayCodeLimitInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWimipayCodeLimitInfoExample() {
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