package com.sql.mapperBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TLandIdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLandIdExample() {
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

        public Criteria andLandIdIsNull() {
            addCriterion("land_id is null");
            return (Criteria) this;
        }

        public Criteria andLandIdIsNotNull() {
            addCriterion("land_id is not null");
            return (Criteria) this;
        }

        public Criteria andLandIdEqualTo(Integer value) {
            addCriterion("land_id =", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdNotEqualTo(Integer value) {
            addCriterion("land_id <>", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdGreaterThan(Integer value) {
            addCriterion("land_id >", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("land_id >=", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdLessThan(Integer value) {
            addCriterion("land_id <", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdLessThanOrEqualTo(Integer value) {
            addCriterion("land_id <=", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdIn(List<Integer> values) {
            addCriterion("land_id in", values, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdNotIn(List<Integer> values) {
            addCriterion("land_id not in", values, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdBetween(Integer value1, Integer value2) {
            addCriterion("land_id between", value1, value2, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("land_id not between", value1, value2, "landId");
            return (Criteria) this;
        }

        public Criteria andLandTimeIsNull() {
            addCriterion("land_time is null");
            return (Criteria) this;
        }

        public Criteria andLandTimeIsNotNull() {
            addCriterion("land_time is not null");
            return (Criteria) this;
        }

        public Criteria andLandTimeEqualTo(Date value) {
            addCriterion("land_time =", value, "landTime");
            return (Criteria) this;
        }

        public Criteria andLandTimeNotEqualTo(Date value) {
            addCriterion("land_time <>", value, "landTime");
            return (Criteria) this;
        }

        public Criteria andLandTimeGreaterThan(Date value) {
            addCriterion("land_time >", value, "landTime");
            return (Criteria) this;
        }

        public Criteria andLandTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("land_time >=", value, "landTime");
            return (Criteria) this;
        }

        public Criteria andLandTimeLessThan(Date value) {
            addCriterion("land_time <", value, "landTime");
            return (Criteria) this;
        }

        public Criteria andLandTimeLessThanOrEqualTo(Date value) {
            addCriterion("land_time <=", value, "landTime");
            return (Criteria) this;
        }

        public Criteria andLandTimeIn(List<Date> values) {
            addCriterion("land_time in", values, "landTime");
            return (Criteria) this;
        }

        public Criteria andLandTimeNotIn(List<Date> values) {
            addCriterion("land_time not in", values, "landTime");
            return (Criteria) this;
        }

        public Criteria andLandTimeBetween(Date value1, Date value2) {
            addCriterion("land_time between", value1, value2, "landTime");
            return (Criteria) this;
        }

        public Criteria andLandTimeNotBetween(Date value1, Date value2) {
            addCriterion("land_time not between", value1, value2, "landTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andIsCloseIsNull() {
            addCriterion("is_close is null");
            return (Criteria) this;
        }

        public Criteria andIsCloseIsNotNull() {
            addCriterion("is_close is not null");
            return (Criteria) this;
        }

        public Criteria andIsCloseEqualTo(Boolean value) {
            addCriterion("is_close =", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseNotEqualTo(Boolean value) {
            addCriterion("is_close <>", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseGreaterThan(Boolean value) {
            addCriterion("is_close >", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_close >=", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseLessThan(Boolean value) {
            addCriterion("is_close <", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseLessThanOrEqualTo(Boolean value) {
            addCriterion("is_close <=", value, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseIn(List<Boolean> values) {
            addCriterion("is_close in", values, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseNotIn(List<Boolean> values) {
            addCriterion("is_close not in", values, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseBetween(Boolean value1, Boolean value2) {
            addCriterion("is_close between", value1, value2, "isClose");
            return (Criteria) this;
        }

        public Criteria andIsCloseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_close not between", value1, value2, "isClose");
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