package com.sql.mapperBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TMonegChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMonegChangeExample() {
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

        public Criteria andMoneyInitIsNull() {
            addCriterion("money_init is null");
            return (Criteria) this;
        }

        public Criteria andMoneyInitIsNotNull() {
            addCriterion("money_init is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyInitEqualTo(Float value) {
            addCriterion("money_init =", value, "moneyInit");
            return (Criteria) this;
        }

        public Criteria andMoneyInitNotEqualTo(Float value) {
            addCriterion("money_init <>", value, "moneyInit");
            return (Criteria) this;
        }

        public Criteria andMoneyInitGreaterThan(Float value) {
            addCriterion("money_init >", value, "moneyInit");
            return (Criteria) this;
        }

        public Criteria andMoneyInitGreaterThanOrEqualTo(Float value) {
            addCriterion("money_init >=", value, "moneyInit");
            return (Criteria) this;
        }

        public Criteria andMoneyInitLessThan(Float value) {
            addCriterion("money_init <", value, "moneyInit");
            return (Criteria) this;
        }

        public Criteria andMoneyInitLessThanOrEqualTo(Float value) {
            addCriterion("money_init <=", value, "moneyInit");
            return (Criteria) this;
        }

        public Criteria andMoneyInitIn(List<Float> values) {
            addCriterion("money_init in", values, "moneyInit");
            return (Criteria) this;
        }

        public Criteria andMoneyInitNotIn(List<Float> values) {
            addCriterion("money_init not in", values, "moneyInit");
            return (Criteria) this;
        }

        public Criteria andMoneyInitBetween(Float value1, Float value2) {
            addCriterion("money_init between", value1, value2, "moneyInit");
            return (Criteria) this;
        }

        public Criteria andMoneyInitNotBetween(Float value1, Float value2) {
            addCriterion("money_init not between", value1, value2, "moneyInit");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeIsNull() {
            addCriterion("money_change is null");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeIsNotNull() {
            addCriterion("money_change is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeEqualTo(Float value) {
            addCriterion("money_change =", value, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeNotEqualTo(Float value) {
            addCriterion("money_change <>", value, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeGreaterThan(Float value) {
            addCriterion("money_change >", value, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeGreaterThanOrEqualTo(Float value) {
            addCriterion("money_change >=", value, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeLessThan(Float value) {
            addCriterion("money_change <", value, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeLessThanOrEqualTo(Float value) {
            addCriterion("money_change <=", value, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeIn(List<Float> values) {
            addCriterion("money_change in", values, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeNotIn(List<Float> values) {
            addCriterion("money_change not in", values, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeBetween(Float value1, Float value2) {
            addCriterion("money_change between", value1, value2, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeNotBetween(Float value1, Float value2) {
            addCriterion("money_change not between", value1, value2, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeIsNull() {
            addCriterion("money_change_type is null");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeIsNotNull() {
            addCriterion("money_change_type is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeEqualTo(Integer value) {
            addCriterion("money_change_type =", value, "moneyChangeType");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNotEqualTo(Integer value) {
            addCriterion("money_change_type <>", value, "moneyChangeType");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeGreaterThan(Integer value) {
            addCriterion("money_change_type >", value, "moneyChangeType");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("money_change_type >=", value, "moneyChangeType");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeLessThan(Integer value) {
            addCriterion("money_change_type <", value, "moneyChangeType");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("money_change_type <=", value, "moneyChangeType");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeIn(List<Integer> values) {
            addCriterion("money_change_type in", values, "moneyChangeType");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNotIn(List<Integer> values) {
            addCriterion("money_change_type not in", values, "moneyChangeType");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeBetween(Integer value1, Integer value2) {
            addCriterion("money_change_type between", value1, value2, "moneyChangeType");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("money_change_type not between", value1, value2, "moneyChangeType");
            return (Criteria) this;
        }

        public Criteria andMoneyFinishIsNull() {
            addCriterion("money_finish is null");
            return (Criteria) this;
        }

        public Criteria andMoneyFinishIsNotNull() {
            addCriterion("money_finish is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyFinishEqualTo(Float value) {
            addCriterion("money_finish =", value, "moneyFinish");
            return (Criteria) this;
        }

        public Criteria andMoneyFinishNotEqualTo(Float value) {
            addCriterion("money_finish <>", value, "moneyFinish");
            return (Criteria) this;
        }

        public Criteria andMoneyFinishGreaterThan(Float value) {
            addCriterion("money_finish >", value, "moneyFinish");
            return (Criteria) this;
        }

        public Criteria andMoneyFinishGreaterThanOrEqualTo(Float value) {
            addCriterion("money_finish >=", value, "moneyFinish");
            return (Criteria) this;
        }

        public Criteria andMoneyFinishLessThan(Float value) {
            addCriterion("money_finish <", value, "moneyFinish");
            return (Criteria) this;
        }

        public Criteria andMoneyFinishLessThanOrEqualTo(Float value) {
            addCriterion("money_finish <=", value, "moneyFinish");
            return (Criteria) this;
        }

        public Criteria andMoneyFinishIn(List<Float> values) {
            addCriterion("money_finish in", values, "moneyFinish");
            return (Criteria) this;
        }

        public Criteria andMoneyFinishNotIn(List<Float> values) {
            addCriterion("money_finish not in", values, "moneyFinish");
            return (Criteria) this;
        }

        public Criteria andMoneyFinishBetween(Float value1, Float value2) {
            addCriterion("money_finish between", value1, value2, "moneyFinish");
            return (Criteria) this;
        }

        public Criteria andMoneyFinishNotBetween(Float value1, Float value2) {
            addCriterion("money_finish not between", value1, value2, "moneyFinish");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameIsNull() {
            addCriterion("money_change_type_name is null");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameIsNotNull() {
            addCriterion("money_change_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameEqualTo(String value) {
            addCriterion("money_change_type_name =", value, "moneyChangeTypeName");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameNotEqualTo(String value) {
            addCriterion("money_change_type_name <>", value, "moneyChangeTypeName");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameGreaterThan(String value) {
            addCriterion("money_change_type_name >", value, "moneyChangeTypeName");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("money_change_type_name >=", value, "moneyChangeTypeName");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameLessThan(String value) {
            addCriterion("money_change_type_name <", value, "moneyChangeTypeName");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameLessThanOrEqualTo(String value) {
            addCriterion("money_change_type_name <=", value, "moneyChangeTypeName");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameLike(String value) {
            addCriterion("money_change_type_name like", value, "moneyChangeTypeName");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameNotLike(String value) {
            addCriterion("money_change_type_name not like", value, "moneyChangeTypeName");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameIn(List<String> values) {
            addCriterion("money_change_type_name in", values, "moneyChangeTypeName");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameNotIn(List<String> values) {
            addCriterion("money_change_type_name not in", values, "moneyChangeTypeName");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameBetween(String value1, String value2) {
            addCriterion("money_change_type_name between", value1, value2, "moneyChangeTypeName");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeTypeNameNotBetween(String value1, String value2) {
            addCriterion("money_change_type_name not between", value1, value2, "moneyChangeTypeName");
            return (Criteria) this;
        }

        public Criteria andChangeUserIsNull() {
            addCriterion("change_user is null");
            return (Criteria) this;
        }

        public Criteria andChangeUserIsNotNull() {
            addCriterion("change_user is not null");
            return (Criteria) this;
        }

        public Criteria andChangeUserEqualTo(String value) {
            addCriterion("change_user =", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserNotEqualTo(String value) {
            addCriterion("change_user <>", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserGreaterThan(String value) {
            addCriterion("change_user >", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserGreaterThanOrEqualTo(String value) {
            addCriterion("change_user >=", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserLessThan(String value) {
            addCriterion("change_user <", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserLessThanOrEqualTo(String value) {
            addCriterion("change_user <=", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserLike(String value) {
            addCriterion("change_user like", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserNotLike(String value) {
            addCriterion("change_user not like", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserIn(List<String> values) {
            addCriterion("change_user in", values, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserNotIn(List<String> values) {
            addCriterion("change_user not in", values, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserBetween(String value1, String value2) {
            addCriterion("change_user between", value1, value2, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserNotBetween(String value1, String value2) {
            addCriterion("change_user not between", value1, value2, "changeUser");
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

        public Criteria andChangrFlightIsNull() {
            addCriterion("changr_flight is null");
            return (Criteria) this;
        }

        public Criteria andChangrFlightIsNotNull() {
            addCriterion("changr_flight is not null");
            return (Criteria) this;
        }

        public Criteria andChangrFlightEqualTo(Date value) {
            addCriterionForJDBCDate("changr_flight =", value, "changrFlight");
            return (Criteria) this;
        }

        public Criteria andChangrFlightNotEqualTo(Date value) {
            addCriterionForJDBCDate("changr_flight <>", value, "changrFlight");
            return (Criteria) this;
        }

        public Criteria andChangrFlightGreaterThan(Date value) {
            addCriterionForJDBCDate("changr_flight >", value, "changrFlight");
            return (Criteria) this;
        }

        public Criteria andChangrFlightGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("changr_flight >=", value, "changrFlight");
            return (Criteria) this;
        }

        public Criteria andChangrFlightLessThan(Date value) {
            addCriterionForJDBCDate("changr_flight <", value, "changrFlight");
            return (Criteria) this;
        }

        public Criteria andChangrFlightLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("changr_flight <=", value, "changrFlight");
            return (Criteria) this;
        }

        public Criteria andChangrFlightIn(List<Date> values) {
            addCriterionForJDBCDate("changr_flight in", values, "changrFlight");
            return (Criteria) this;
        }

        public Criteria andChangrFlightNotIn(List<Date> values) {
            addCriterionForJDBCDate("changr_flight not in", values, "changrFlight");
            return (Criteria) this;
        }

        public Criteria andChangrFlightBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("changr_flight between", value1, value2, "changrFlight");
            return (Criteria) this;
        }

        public Criteria andChangrFlightNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("changr_flight not between", value1, value2, "changrFlight");
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