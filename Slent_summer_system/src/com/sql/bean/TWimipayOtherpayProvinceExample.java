package com.sql.bean;

import java.util.ArrayList;
import java.util.List;

public class TWimipayOtherpayProvinceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWimipayOtherpayProvinceExample() {
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

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andTableIsNull() {
            addCriterion("table_ is null");
            return (Criteria) this;
        }

        public Criteria andTableIsNotNull() {
            addCriterion("table_ is not null");
            return (Criteria) this;
        }

        public Criteria andTableEqualTo(String value) {
            addCriterion("table_ =", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotEqualTo(String value) {
            addCriterion("table_ <>", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableGreaterThan(String value) {
            addCriterion("table_ >", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableGreaterThanOrEqualTo(String value) {
            addCriterion("table_ >=", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableLessThan(String value) {
            addCriterion("table_ <", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableLessThanOrEqualTo(String value) {
            addCriterion("table_ <=", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableLike(String value) {
            addCriterion("table_ like", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotLike(String value) {
            addCriterion("table_ not like", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableIn(List<String> values) {
            addCriterion("table_ in", values, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotIn(List<String> values) {
            addCriterion("table_ not in", values, "table");
            return (Criteria) this;
        }

        public Criteria andTableBetween(String value1, String value2) {
            addCriterion("table_ between", value1, value2, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotBetween(String value1, String value2) {
            addCriterion("table_ not between", value1, value2, "table");
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

        public Criteria andOperatorIsNull() {
            addCriterion("operator_ is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator_ is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator_ =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator_ <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator_ >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator_ >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator_ <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator_ <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator_ like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator_ not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator_ in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator_ not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator_ between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator_ not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andNumtableIsNull() {
            addCriterion("numtable_ is null");
            return (Criteria) this;
        }

        public Criteria andNumtableIsNotNull() {
            addCriterion("numtable_ is not null");
            return (Criteria) this;
        }

        public Criteria andNumtableEqualTo(String value) {
            addCriterion("numtable_ =", value, "numtable");
            return (Criteria) this;
        }

        public Criteria andNumtableNotEqualTo(String value) {
            addCriterion("numtable_ <>", value, "numtable");
            return (Criteria) this;
        }

        public Criteria andNumtableGreaterThan(String value) {
            addCriterion("numtable_ >", value, "numtable");
            return (Criteria) this;
        }

        public Criteria andNumtableGreaterThanOrEqualTo(String value) {
            addCriterion("numtable_ >=", value, "numtable");
            return (Criteria) this;
        }

        public Criteria andNumtableLessThan(String value) {
            addCriterion("numtable_ <", value, "numtable");
            return (Criteria) this;
        }

        public Criteria andNumtableLessThanOrEqualTo(String value) {
            addCriterion("numtable_ <=", value, "numtable");
            return (Criteria) this;
        }

        public Criteria andNumtableLike(String value) {
            addCriterion("numtable_ like", value, "numtable");
            return (Criteria) this;
        }

        public Criteria andNumtableNotLike(String value) {
            addCriterion("numtable_ not like", value, "numtable");
            return (Criteria) this;
        }

        public Criteria andNumtableIn(List<String> values) {
            addCriterion("numtable_ in", values, "numtable");
            return (Criteria) this;
        }

        public Criteria andNumtableNotIn(List<String> values) {
            addCriterion("numtable_ not in", values, "numtable");
            return (Criteria) this;
        }

        public Criteria andNumtableBetween(String value1, String value2) {
            addCriterion("numtable_ between", value1, value2, "numtable");
            return (Criteria) this;
        }

        public Criteria andNumtableNotBetween(String value1, String value2) {
            addCriterion("numtable_ not between", value1, value2, "numtable");
            return (Criteria) this;
        }

        public Criteria andDatetableIsNull() {
            addCriterion("datetable_ is null");
            return (Criteria) this;
        }

        public Criteria andDatetableIsNotNull() {
            addCriterion("datetable_ is not null");
            return (Criteria) this;
        }

        public Criteria andDatetableEqualTo(String value) {
            addCriterion("datetable_ =", value, "datetable");
            return (Criteria) this;
        }

        public Criteria andDatetableNotEqualTo(String value) {
            addCriterion("datetable_ <>", value, "datetable");
            return (Criteria) this;
        }

        public Criteria andDatetableGreaterThan(String value) {
            addCriterion("datetable_ >", value, "datetable");
            return (Criteria) this;
        }

        public Criteria andDatetableGreaterThanOrEqualTo(String value) {
            addCriterion("datetable_ >=", value, "datetable");
            return (Criteria) this;
        }

        public Criteria andDatetableLessThan(String value) {
            addCriterion("datetable_ <", value, "datetable");
            return (Criteria) this;
        }

        public Criteria andDatetableLessThanOrEqualTo(String value) {
            addCriterion("datetable_ <=", value, "datetable");
            return (Criteria) this;
        }

        public Criteria andDatetableLike(String value) {
            addCriterion("datetable_ like", value, "datetable");
            return (Criteria) this;
        }

        public Criteria andDatetableNotLike(String value) {
            addCriterion("datetable_ not like", value, "datetable");
            return (Criteria) this;
        }

        public Criteria andDatetableIn(List<String> values) {
            addCriterion("datetable_ in", values, "datetable");
            return (Criteria) this;
        }

        public Criteria andDatetableNotIn(List<String> values) {
            addCriterion("datetable_ not in", values, "datetable");
            return (Criteria) this;
        }

        public Criteria andDatetableBetween(String value1, String value2) {
            addCriterion("datetable_ between", value1, value2, "datetable");
            return (Criteria) this;
        }

        public Criteria andDatetableNotBetween(String value1, String value2) {
            addCriterion("datetable_ not between", value1, value2, "datetable");
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