package com.sql.mapperBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SVipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SVipExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPassWIsNull() {
            addCriterion("pass_w is null");
            return (Criteria) this;
        }

        public Criteria andPassWIsNotNull() {
            addCriterion("pass_w is not null");
            return (Criteria) this;
        }

        public Criteria andPassWEqualTo(String value) {
            addCriterion("pass_w =", value, "passW");
            return (Criteria) this;
        }

        public Criteria andPassWNotEqualTo(String value) {
            addCriterion("pass_w <>", value, "passW");
            return (Criteria) this;
        }

        public Criteria andPassWGreaterThan(String value) {
            addCriterion("pass_w >", value, "passW");
            return (Criteria) this;
        }

        public Criteria andPassWGreaterThanOrEqualTo(String value) {
            addCriterion("pass_w >=", value, "passW");
            return (Criteria) this;
        }

        public Criteria andPassWLessThan(String value) {
            addCriterion("pass_w <", value, "passW");
            return (Criteria) this;
        }

        public Criteria andPassWLessThanOrEqualTo(String value) {
            addCriterion("pass_w <=", value, "passW");
            return (Criteria) this;
        }

        public Criteria andPassWLike(String value) {
            addCriterion("pass_w like", value, "passW");
            return (Criteria) this;
        }

        public Criteria andPassWNotLike(String value) {
            addCriterion("pass_w not like", value, "passW");
            return (Criteria) this;
        }

        public Criteria andPassWIn(List<String> values) {
            addCriterion("pass_w in", values, "passW");
            return (Criteria) this;
        }

        public Criteria andPassWNotIn(List<String> values) {
            addCriterion("pass_w not in", values, "passW");
            return (Criteria) this;
        }

        public Criteria andPassWBetween(String value1, String value2) {
            addCriterion("pass_w between", value1, value2, "passW");
            return (Criteria) this;
        }

        public Criteria andPassWNotBetween(String value1, String value2) {
            addCriterion("pass_w not between", value1, value2, "passW");
            return (Criteria) this;
        }

        public Criteria andRefereeIsNull() {
            addCriterion("referee is null");
            return (Criteria) this;
        }

        public Criteria andRefereeIsNotNull() {
            addCriterion("referee is not null");
            return (Criteria) this;
        }

        public Criteria andRefereeEqualTo(Long value) {
            addCriterion("referee =", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotEqualTo(Long value) {
            addCriterion("referee <>", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeGreaterThan(Long value) {
            addCriterion("referee >", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeGreaterThanOrEqualTo(Long value) {
            addCriterion("referee >=", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeLessThan(Long value) {
            addCriterion("referee <", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeLessThanOrEqualTo(Long value) {
            addCriterion("referee <=", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeIn(List<Long> values) {
            addCriterion("referee in", values, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotIn(List<Long> values) {
            addCriterion("referee not in", values, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeBetween(Long value1, Long value2) {
            addCriterion("referee between", value1, value2, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotBetween(Long value1, Long value2) {
            addCriterion("referee not between", value1, value2, "referee");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Float value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Float value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Float value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Float value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Float value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Float> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Float> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Float value1, Float value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Float value1, Float value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andLvlIsNull() {
            addCriterion("lvl is null");
            return (Criteria) this;
        }

        public Criteria andLvlIsNotNull() {
            addCriterion("lvl is not null");
            return (Criteria) this;
        }

        public Criteria andLvlEqualTo(Integer value) {
            addCriterion("lvl =", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlNotEqualTo(Integer value) {
            addCriterion("lvl <>", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlGreaterThan(Integer value) {
            addCriterion("lvl >", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlGreaterThanOrEqualTo(Integer value) {
            addCriterion("lvl >=", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlLessThan(Integer value) {
            addCriterion("lvl <", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlLessThanOrEqualTo(Integer value) {
            addCriterion("lvl <=", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlIn(List<Integer> values) {
            addCriterion("lvl in", values, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlNotIn(List<Integer> values) {
            addCriterion("lvl not in", values, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlBetween(Integer value1, Integer value2) {
            addCriterion("lvl between", value1, value2, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlNotBetween(Integer value1, Integer value2) {
            addCriterion("lvl not between", value1, value2, "lvl");
            return (Criteria) this;
        }

        public Criteria andCutOffIsNull() {
            addCriterion("cut_off is null");
            return (Criteria) this;
        }

        public Criteria andCutOffIsNotNull() {
            addCriterion("cut_off is not null");
            return (Criteria) this;
        }

        public Criteria andCutOffEqualTo(Float value) {
            addCriterion("cut_off =", value, "cutOff");
            return (Criteria) this;
        }

        public Criteria andCutOffNotEqualTo(Float value) {
            addCriterion("cut_off <>", value, "cutOff");
            return (Criteria) this;
        }

        public Criteria andCutOffGreaterThan(Float value) {
            addCriterion("cut_off >", value, "cutOff");
            return (Criteria) this;
        }

        public Criteria andCutOffGreaterThanOrEqualTo(Float value) {
            addCriterion("cut_off >=", value, "cutOff");
            return (Criteria) this;
        }

        public Criteria andCutOffLessThan(Float value) {
            addCriterion("cut_off <", value, "cutOff");
            return (Criteria) this;
        }

        public Criteria andCutOffLessThanOrEqualTo(Float value) {
            addCriterion("cut_off <=", value, "cutOff");
            return (Criteria) this;
        }

        public Criteria andCutOffIn(List<Float> values) {
            addCriterion("cut_off in", values, "cutOff");
            return (Criteria) this;
        }

        public Criteria andCutOffNotIn(List<Float> values) {
            addCriterion("cut_off not in", values, "cutOff");
            return (Criteria) this;
        }

        public Criteria andCutOffBetween(Float value1, Float value2) {
            addCriterion("cut_off between", value1, value2, "cutOff");
            return (Criteria) this;
        }

        public Criteria andCutOffNotBetween(Float value1, Float value2) {
            addCriterion("cut_off not between", value1, value2, "cutOff");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNull() {
            addCriterion("history is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNotNull() {
            addCriterion("history is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryEqualTo(Float value) {
            addCriterion("history =", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotEqualTo(Float value) {
            addCriterion("history <>", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThan(Float value) {
            addCriterion("history >", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThanOrEqualTo(Float value) {
            addCriterion("history >=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThan(Float value) {
            addCriterion("history <", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThanOrEqualTo(Float value) {
            addCriterion("history <=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryIn(List<Float> values) {
            addCriterion("history in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotIn(List<Float> values) {
            addCriterion("history not in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryBetween(Float value1, Float value2) {
            addCriterion("history between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotBetween(Float value1, Float value2) {
            addCriterion("history not between", value1, value2, "history");
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