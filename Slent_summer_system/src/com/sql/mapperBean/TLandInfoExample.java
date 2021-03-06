package com.sql.mapperBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TLandInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLandInfoExample() {
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

        public Criteria andLandUserIsNull() {
            addCriterion("land_user is null");
            return (Criteria) this;
        }

        public Criteria andLandUserIsNotNull() {
            addCriterion("land_user is not null");
            return (Criteria) this;
        }

        public Criteria andLandUserEqualTo(String value) {
            addCriterion("land_user =", value, "landUser");
            return (Criteria) this;
        }

        public Criteria andLandUserNotEqualTo(String value) {
            addCriterion("land_user <>", value, "landUser");
            return (Criteria) this;
        }

        public Criteria andLandUserGreaterThan(String value) {
            addCriterion("land_user >", value, "landUser");
            return (Criteria) this;
        }

        public Criteria andLandUserGreaterThanOrEqualTo(String value) {
            addCriterion("land_user >=", value, "landUser");
            return (Criteria) this;
        }

        public Criteria andLandUserLessThan(String value) {
            addCriterion("land_user <", value, "landUser");
            return (Criteria) this;
        }

        public Criteria andLandUserLessThanOrEqualTo(String value) {
            addCriterion("land_user <=", value, "landUser");
            return (Criteria) this;
        }

        public Criteria andLandUserLike(String value) {
            addCriterion("land_user like", value, "landUser");
            return (Criteria) this;
        }

        public Criteria andLandUserNotLike(String value) {
            addCriterion("land_user not like", value, "landUser");
            return (Criteria) this;
        }

        public Criteria andLandUserIn(List<String> values) {
            addCriterion("land_user in", values, "landUser");
            return (Criteria) this;
        }

        public Criteria andLandUserNotIn(List<String> values) {
            addCriterion("land_user not in", values, "landUser");
            return (Criteria) this;
        }

        public Criteria andLandUserBetween(String value1, String value2) {
            addCriterion("land_user between", value1, value2, "landUser");
            return (Criteria) this;
        }

        public Criteria andLandUserNotBetween(String value1, String value2) {
            addCriterion("land_user not between", value1, value2, "landUser");
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

        public Criteria andCloseIsNull() {
            addCriterion("close is null");
            return (Criteria) this;
        }

        public Criteria andCloseIsNotNull() {
            addCriterion("close is not null");
            return (Criteria) this;
        }

        public Criteria andCloseEqualTo(Boolean value) {
            addCriterion("close =", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotEqualTo(Boolean value) {
            addCriterion("close <>", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThan(Boolean value) {
            addCriterion("close >", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("close >=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThan(Boolean value) {
            addCriterion("close <", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThanOrEqualTo(Boolean value) {
            addCriterion("close <=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseIn(List<Boolean> values) {
            addCriterion("close in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotIn(List<Boolean> values) {
            addCriterion("close not in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseBetween(Boolean value1, Boolean value2) {
            addCriterion("close between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("close not between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andNextUserIsNull() {
            addCriterion("next_user is null");
            return (Criteria) this;
        }

        public Criteria andNextUserIsNotNull() {
            addCriterion("next_user is not null");
            return (Criteria) this;
        }

        public Criteria andNextUserEqualTo(String value) {
            addCriterion("next_user =", value, "nextUser");
            return (Criteria) this;
        }

        public Criteria andNextUserNotEqualTo(String value) {
            addCriterion("next_user <>", value, "nextUser");
            return (Criteria) this;
        }

        public Criteria andNextUserGreaterThan(String value) {
            addCriterion("next_user >", value, "nextUser");
            return (Criteria) this;
        }

        public Criteria andNextUserGreaterThanOrEqualTo(String value) {
            addCriterion("next_user >=", value, "nextUser");
            return (Criteria) this;
        }

        public Criteria andNextUserLessThan(String value) {
            addCriterion("next_user <", value, "nextUser");
            return (Criteria) this;
        }

        public Criteria andNextUserLessThanOrEqualTo(String value) {
            addCriterion("next_user <=", value, "nextUser");
            return (Criteria) this;
        }

        public Criteria andNextUserLike(String value) {
            addCriterion("next_user like", value, "nextUser");
            return (Criteria) this;
        }

        public Criteria andNextUserNotLike(String value) {
            addCriterion("next_user not like", value, "nextUser");
            return (Criteria) this;
        }

        public Criteria andNextUserIn(List<String> values) {
            addCriterion("next_user in", values, "nextUser");
            return (Criteria) this;
        }

        public Criteria andNextUserNotIn(List<String> values) {
            addCriterion("next_user not in", values, "nextUser");
            return (Criteria) this;
        }

        public Criteria andNextUserBetween(String value1, String value2) {
            addCriterion("next_user between", value1, value2, "nextUser");
            return (Criteria) this;
        }

        public Criteria andNextUserNotBetween(String value1, String value2) {
            addCriterion("next_user not between", value1, value2, "nextUser");
            return (Criteria) this;
        }

        public Criteria andHasNextIsNull() {
            addCriterion("has_next is null");
            return (Criteria) this;
        }

        public Criteria andHasNextIsNotNull() {
            addCriterion("has_next is not null");
            return (Criteria) this;
        }

        public Criteria andHasNextEqualTo(Boolean value) {
            addCriterion("has_next =", value, "hasNext");
            return (Criteria) this;
        }

        public Criteria andHasNextNotEqualTo(Boolean value) {
            addCriterion("has_next <>", value, "hasNext");
            return (Criteria) this;
        }

        public Criteria andHasNextGreaterThan(Boolean value) {
            addCriterion("has_next >", value, "hasNext");
            return (Criteria) this;
        }

        public Criteria andHasNextGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_next >=", value, "hasNext");
            return (Criteria) this;
        }

        public Criteria andHasNextLessThan(Boolean value) {
            addCriterion("has_next <", value, "hasNext");
            return (Criteria) this;
        }

        public Criteria andHasNextLessThanOrEqualTo(Boolean value) {
            addCriterion("has_next <=", value, "hasNext");
            return (Criteria) this;
        }

        public Criteria andHasNextIn(List<Boolean> values) {
            addCriterion("has_next in", values, "hasNext");
            return (Criteria) this;
        }

        public Criteria andHasNextNotIn(List<Boolean> values) {
            addCriterion("has_next not in", values, "hasNext");
            return (Criteria) this;
        }

        public Criteria andHasNextBetween(Boolean value1, Boolean value2) {
            addCriterion("has_next between", value1, value2, "hasNext");
            return (Criteria) this;
        }

        public Criteria andHasNextNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_next not between", value1, value2, "hasNext");
            return (Criteria) this;
        }

        public Criteria andMoneyInIsNull() {
            addCriterion("money_in is null");
            return (Criteria) this;
        }

        public Criteria andMoneyInIsNotNull() {
            addCriterion("money_in is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyInEqualTo(Float value) {
            addCriterion("money_in =", value, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInNotEqualTo(Float value) {
            addCriterion("money_in <>", value, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInGreaterThan(Float value) {
            addCriterion("money_in >", value, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInGreaterThanOrEqualTo(Float value) {
            addCriterion("money_in >=", value, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInLessThan(Float value) {
            addCriterion("money_in <", value, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInLessThanOrEqualTo(Float value) {
            addCriterion("money_in <=", value, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInIn(List<Float> values) {
            addCriterion("money_in in", values, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInNotIn(List<Float> values) {
            addCriterion("money_in not in", values, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInBetween(Float value1, Float value2) {
            addCriterion("money_in between", value1, value2, "moneyIn");
            return (Criteria) this;
        }

        public Criteria andMoneyInNotBetween(Float value1, Float value2) {
            addCriterion("money_in not between", value1, value2, "moneyIn");
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

        public Criteria andMoneyNeedIsNull() {
            addCriterion("money_need is null");
            return (Criteria) this;
        }

        public Criteria andMoneyNeedIsNotNull() {
            addCriterion("money_need is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyNeedEqualTo(Float value) {
            addCriterion("money_need =", value, "moneyNeed");
            return (Criteria) this;
        }

        public Criteria andMoneyNeedNotEqualTo(Float value) {
            addCriterion("money_need <>", value, "moneyNeed");
            return (Criteria) this;
        }

        public Criteria andMoneyNeedGreaterThan(Float value) {
            addCriterion("money_need >", value, "moneyNeed");
            return (Criteria) this;
        }

        public Criteria andMoneyNeedGreaterThanOrEqualTo(Float value) {
            addCriterion("money_need >=", value, "moneyNeed");
            return (Criteria) this;
        }

        public Criteria andMoneyNeedLessThan(Float value) {
            addCriterion("money_need <", value, "moneyNeed");
            return (Criteria) this;
        }

        public Criteria andMoneyNeedLessThanOrEqualTo(Float value) {
            addCriterion("money_need <=", value, "moneyNeed");
            return (Criteria) this;
        }

        public Criteria andMoneyNeedIn(List<Float> values) {
            addCriterion("money_need in", values, "moneyNeed");
            return (Criteria) this;
        }

        public Criteria andMoneyNeedNotIn(List<Float> values) {
            addCriterion("money_need not in", values, "moneyNeed");
            return (Criteria) this;
        }

        public Criteria andMoneyNeedBetween(Float value1, Float value2) {
            addCriterion("money_need between", value1, value2, "moneyNeed");
            return (Criteria) this;
        }

        public Criteria andMoneyNeedNotBetween(Float value1, Float value2) {
            addCriterion("money_need not between", value1, value2, "moneyNeed");
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