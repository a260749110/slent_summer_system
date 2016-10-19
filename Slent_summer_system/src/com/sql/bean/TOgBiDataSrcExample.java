package com.sql.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOgBiDataSrcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOgBiDataSrcExample() {
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

        public Criteria andBSessionIsNull() {
            addCriterion("b_session is null");
            return (Criteria) this;
        }

        public Criteria andBSessionIsNotNull() {
            addCriterion("b_session is not null");
            return (Criteria) this;
        }

        public Criteria andBSessionEqualTo(String value) {
            addCriterion("b_session =", value, "bSession");
            return (Criteria) this;
        }

        public Criteria andBSessionNotEqualTo(String value) {
            addCriterion("b_session <>", value, "bSession");
            return (Criteria) this;
        }

        public Criteria andBSessionGreaterThan(String value) {
            addCriterion("b_session >", value, "bSession");
            return (Criteria) this;
        }

        public Criteria andBSessionGreaterThanOrEqualTo(String value) {
            addCriterion("b_session >=", value, "bSession");
            return (Criteria) this;
        }

        public Criteria andBSessionLessThan(String value) {
            addCriterion("b_session <", value, "bSession");
            return (Criteria) this;
        }

        public Criteria andBSessionLessThanOrEqualTo(String value) {
            addCriterion("b_session <=", value, "bSession");
            return (Criteria) this;
        }

        public Criteria andBSessionLike(String value) {
            addCriterion("b_session like", value, "bSession");
            return (Criteria) this;
        }

        public Criteria andBSessionNotLike(String value) {
            addCriterion("b_session not like", value, "bSession");
            return (Criteria) this;
        }

        public Criteria andBSessionIn(List<String> values) {
            addCriterion("b_session in", values, "bSession");
            return (Criteria) this;
        }

        public Criteria andBSessionNotIn(List<String> values) {
            addCriterion("b_session not in", values, "bSession");
            return (Criteria) this;
        }

        public Criteria andBSessionBetween(String value1, String value2) {
            addCriterion("b_session between", value1, value2, "bSession");
            return (Criteria) this;
        }

        public Criteria andBSessionNotBetween(String value1, String value2) {
            addCriterion("b_session not between", value1, value2, "bSession");
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

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andWimicodeIsNull() {
            addCriterion("wimicode is null");
            return (Criteria) this;
        }

        public Criteria andWimicodeIsNotNull() {
            addCriterion("wimicode is not null");
            return (Criteria) this;
        }

        public Criteria andWimicodeEqualTo(String value) {
            addCriterion("wimicode =", value, "wimicode");
            return (Criteria) this;
        }

        public Criteria andWimicodeNotEqualTo(String value) {
            addCriterion("wimicode <>", value, "wimicode");
            return (Criteria) this;
        }

        public Criteria andWimicodeGreaterThan(String value) {
            addCriterion("wimicode >", value, "wimicode");
            return (Criteria) this;
        }

        public Criteria andWimicodeGreaterThanOrEqualTo(String value) {
            addCriterion("wimicode >=", value, "wimicode");
            return (Criteria) this;
        }

        public Criteria andWimicodeLessThan(String value) {
            addCriterion("wimicode <", value, "wimicode");
            return (Criteria) this;
        }

        public Criteria andWimicodeLessThanOrEqualTo(String value) {
            addCriterion("wimicode <=", value, "wimicode");
            return (Criteria) this;
        }

        public Criteria andWimicodeLike(String value) {
            addCriterion("wimicode like", value, "wimicode");
            return (Criteria) this;
        }

        public Criteria andWimicodeNotLike(String value) {
            addCriterion("wimicode not like", value, "wimicode");
            return (Criteria) this;
        }

        public Criteria andWimicodeIn(List<String> values) {
            addCriterion("wimicode in", values, "wimicode");
            return (Criteria) this;
        }

        public Criteria andWimicodeNotIn(List<String> values) {
            addCriterion("wimicode not in", values, "wimicode");
            return (Criteria) this;
        }

        public Criteria andWimicodeBetween(String value1, String value2) {
            addCriterion("wimicode between", value1, value2, "wimicode");
            return (Criteria) this;
        }

        public Criteria andWimicodeNotBetween(String value1, String value2) {
            addCriterion("wimicode not between", value1, value2, "wimicode");
            return (Criteria) this;
        }

        public Criteria andServerIsNull() {
            addCriterion("server is null");
            return (Criteria) this;
        }

        public Criteria andServerIsNotNull() {
            addCriterion("server is not null");
            return (Criteria) this;
        }

        public Criteria andServerEqualTo(String value) {
            addCriterion("server =", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerNotEqualTo(String value) {
            addCriterion("server <>", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerGreaterThan(String value) {
            addCriterion("server >", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerGreaterThanOrEqualTo(String value) {
            addCriterion("server >=", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerLessThan(String value) {
            addCriterion("server <", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerLessThanOrEqualTo(String value) {
            addCriterion("server <=", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerLike(String value) {
            addCriterion("server like", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerNotLike(String value) {
            addCriterion("server not like", value, "server");
            return (Criteria) this;
        }

        public Criteria andServerIn(List<String> values) {
            addCriterion("server in", values, "server");
            return (Criteria) this;
        }

        public Criteria andServerNotIn(List<String> values) {
            addCriterion("server not in", values, "server");
            return (Criteria) this;
        }

        public Criteria andServerBetween(String value1, String value2) {
            addCriterion("server between", value1, value2, "server");
            return (Criteria) this;
        }

        public Criteria andServerNotBetween(String value1, String value2) {
            addCriterion("server not between", value1, value2, "server");
            return (Criteria) this;
        }

        public Criteria andImsiIsNull() {
            addCriterion("imsi is null");
            return (Criteria) this;
        }

        public Criteria andImsiIsNotNull() {
            addCriterion("imsi is not null");
            return (Criteria) this;
        }

        public Criteria andImsiEqualTo(String value) {
            addCriterion("imsi =", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotEqualTo(String value) {
            addCriterion("imsi <>", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThan(String value) {
            addCriterion("imsi >", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThanOrEqualTo(String value) {
            addCriterion("imsi >=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThan(String value) {
            addCriterion("imsi <", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThanOrEqualTo(String value) {
            addCriterion("imsi <=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLike(String value) {
            addCriterion("imsi like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotLike(String value) {
            addCriterion("imsi not like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiIn(List<String> values) {
            addCriterion("imsi in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotIn(List<String> values) {
            addCriterion("imsi not in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiBetween(String value1, String value2) {
            addCriterion("imsi between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotBetween(String value1, String value2) {
            addCriterion("imsi not between", value1, value2, "imsi");
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
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

        public Criteria andPaystateIsNull() {
            addCriterion("paystate is null");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNotNull() {
            addCriterion("paystate is not null");
            return (Criteria) this;
        }

        public Criteria andPaystateEqualTo(String value) {
            addCriterion("paystate =", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotEqualTo(String value) {
            addCriterion("paystate <>", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThan(String value) {
            addCriterion("paystate >", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThanOrEqualTo(String value) {
            addCriterion("paystate >=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThan(String value) {
            addCriterion("paystate <", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThanOrEqualTo(String value) {
            addCriterion("paystate <=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLike(String value) {
            addCriterion("paystate like", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotLike(String value) {
            addCriterion("paystate not like", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateIn(List<String> values) {
            addCriterion("paystate in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotIn(List<String> values) {
            addCriterion("paystate not in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateBetween(String value1, String value2) {
            addCriterion("paystate between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotBetween(String value1, String value2) {
            addCriterion("paystate not between", value1, value2, "paystate");
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

        public Criteria andPaytypeIsNull() {
            addCriterion("paytype is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("paytype is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("paytype =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("paytype <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("paytype >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("paytype >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("paytype <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("paytype <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("paytype like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("paytype not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("paytype in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("paytype not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("paytype between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("paytype not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIsNull() {
            addCriterion("errorcode is null");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIsNotNull() {
            addCriterion("errorcode is not null");
            return (Criteria) this;
        }

        public Criteria andErrorcodeEqualTo(String value) {
            addCriterion("errorcode =", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotEqualTo(String value) {
            addCriterion("errorcode <>", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeGreaterThan(String value) {
            addCriterion("errorcode >", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("errorcode >=", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLessThan(String value) {
            addCriterion("errorcode <", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLessThanOrEqualTo(String value) {
            addCriterion("errorcode <=", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLike(String value) {
            addCriterion("errorcode like", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotLike(String value) {
            addCriterion("errorcode not like", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIn(List<String> values) {
            addCriterion("errorcode in", values, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotIn(List<String> values) {
            addCriterion("errorcode not in", values, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeBetween(String value1, String value2) {
            addCriterion("errorcode between", value1, value2, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotBetween(String value1, String value2) {
            addCriterion("errorcode not between", value1, value2, "errorcode");
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