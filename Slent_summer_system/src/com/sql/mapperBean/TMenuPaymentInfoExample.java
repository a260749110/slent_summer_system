package com.sql.mapperBean;

import java.util.ArrayList;
import java.util.List;

public class TMenuPaymentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMenuPaymentInfoExample() {
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

        public Criteria andNNameIsNull() {
            addCriterion("n_name is null");
            return (Criteria) this;
        }

        public Criteria andNNameIsNotNull() {
            addCriterion("n_name is not null");
            return (Criteria) this;
        }

        public Criteria andNNameEqualTo(String value) {
            addCriterion("n_name =", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameNotEqualTo(String value) {
            addCriterion("n_name <>", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameGreaterThan(String value) {
            addCriterion("n_name >", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameGreaterThanOrEqualTo(String value) {
            addCriterion("n_name >=", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameLessThan(String value) {
            addCriterion("n_name <", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameLessThanOrEqualTo(String value) {
            addCriterion("n_name <=", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameLike(String value) {
            addCriterion("n_name like", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameNotLike(String value) {
            addCriterion("n_name not like", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameIn(List<String> values) {
            addCriterion("n_name in", values, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameNotIn(List<String> values) {
            addCriterion("n_name not in", values, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameBetween(String value1, String value2) {
            addCriterion("n_name between", value1, value2, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameNotBetween(String value1, String value2) {
            addCriterion("n_name not between", value1, value2, "nName");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Boolean value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Boolean value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Boolean value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Boolean value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Boolean> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Boolean> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andSelfDataIsNull() {
            addCriterion("self_data is null");
            return (Criteria) this;
        }

        public Criteria andSelfDataIsNotNull() {
            addCriterion("self_data is not null");
            return (Criteria) this;
        }

        public Criteria andSelfDataEqualTo(String value) {
            addCriterion("self_data =", value, "selfData");
            return (Criteria) this;
        }

        public Criteria andSelfDataNotEqualTo(String value) {
            addCriterion("self_data <>", value, "selfData");
            return (Criteria) this;
        }

        public Criteria andSelfDataGreaterThan(String value) {
            addCriterion("self_data >", value, "selfData");
            return (Criteria) this;
        }

        public Criteria andSelfDataGreaterThanOrEqualTo(String value) {
            addCriterion("self_data >=", value, "selfData");
            return (Criteria) this;
        }

        public Criteria andSelfDataLessThan(String value) {
            addCriterion("self_data <", value, "selfData");
            return (Criteria) this;
        }

        public Criteria andSelfDataLessThanOrEqualTo(String value) {
            addCriterion("self_data <=", value, "selfData");
            return (Criteria) this;
        }

        public Criteria andSelfDataLike(String value) {
            addCriterion("self_data like", value, "selfData");
            return (Criteria) this;
        }

        public Criteria andSelfDataNotLike(String value) {
            addCriterion("self_data not like", value, "selfData");
            return (Criteria) this;
        }

        public Criteria andSelfDataIn(List<String> values) {
            addCriterion("self_data in", values, "selfData");
            return (Criteria) this;
        }

        public Criteria andSelfDataNotIn(List<String> values) {
            addCriterion("self_data not in", values, "selfData");
            return (Criteria) this;
        }

        public Criteria andSelfDataBetween(String value1, String value2) {
            addCriterion("self_data between", value1, value2, "selfData");
            return (Criteria) this;
        }

        public Criteria andSelfDataNotBetween(String value1, String value2) {
            addCriterion("self_data not between", value1, value2, "selfData");
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