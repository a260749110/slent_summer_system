package com.sql.mapperBean;

import java.util.ArrayList;
import java.util.List;

public class TMenuLineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMenuLineExample() {
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

        public Criteria andNPriceIsNull() {
            addCriterion("n_price is null");
            return (Criteria) this;
        }

        public Criteria andNPriceIsNotNull() {
            addCriterion("n_price is not null");
            return (Criteria) this;
        }

        public Criteria andNPriceEqualTo(Float value) {
            addCriterion("n_price =", value, "nPrice");
            return (Criteria) this;
        }

        public Criteria andNPriceNotEqualTo(Float value) {
            addCriterion("n_price <>", value, "nPrice");
            return (Criteria) this;
        }

        public Criteria andNPriceGreaterThan(Float value) {
            addCriterion("n_price >", value, "nPrice");
            return (Criteria) this;
        }

        public Criteria andNPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("n_price >=", value, "nPrice");
            return (Criteria) this;
        }

        public Criteria andNPriceLessThan(Float value) {
            addCriterion("n_price <", value, "nPrice");
            return (Criteria) this;
        }

        public Criteria andNPriceLessThanOrEqualTo(Float value) {
            addCriterion("n_price <=", value, "nPrice");
            return (Criteria) this;
        }

        public Criteria andNPriceIn(List<Float> values) {
            addCriterion("n_price in", values, "nPrice");
            return (Criteria) this;
        }

        public Criteria andNPriceNotIn(List<Float> values) {
            addCriterion("n_price not in", values, "nPrice");
            return (Criteria) this;
        }

        public Criteria andNPriceBetween(Float value1, Float value2) {
            addCriterion("n_price between", value1, value2, "nPrice");
            return (Criteria) this;
        }

        public Criteria andNPriceNotBetween(Float value1, Float value2) {
            addCriterion("n_price not between", value1, value2, "nPrice");
            return (Criteria) this;
        }

        public Criteria andPriceVipIsNull() {
            addCriterion("price_vip is null");
            return (Criteria) this;
        }

        public Criteria andPriceVipIsNotNull() {
            addCriterion("price_vip is not null");
            return (Criteria) this;
        }

        public Criteria andPriceVipEqualTo(Float value) {
            addCriterion("price_vip =", value, "priceVip");
            return (Criteria) this;
        }

        public Criteria andPriceVipNotEqualTo(Float value) {
            addCriterion("price_vip <>", value, "priceVip");
            return (Criteria) this;
        }

        public Criteria andPriceVipGreaterThan(Float value) {
            addCriterion("price_vip >", value, "priceVip");
            return (Criteria) this;
        }

        public Criteria andPriceVipGreaterThanOrEqualTo(Float value) {
            addCriterion("price_vip >=", value, "priceVip");
            return (Criteria) this;
        }

        public Criteria andPriceVipLessThan(Float value) {
            addCriterion("price_vip <", value, "priceVip");
            return (Criteria) this;
        }

        public Criteria andPriceVipLessThanOrEqualTo(Float value) {
            addCriterion("price_vip <=", value, "priceVip");
            return (Criteria) this;
        }

        public Criteria andPriceVipIn(List<Float> values) {
            addCriterion("price_vip in", values, "priceVip");
            return (Criteria) this;
        }

        public Criteria andPriceVipNotIn(List<Float> values) {
            addCriterion("price_vip not in", values, "priceVip");
            return (Criteria) this;
        }

        public Criteria andPriceVipBetween(Float value1, Float value2) {
            addCriterion("price_vip between", value1, value2, "priceVip");
            return (Criteria) this;
        }

        public Criteria andPriceVipNotBetween(Float value1, Float value2) {
            addCriterion("price_vip not between", value1, value2, "priceVip");
            return (Criteria) this;
        }

        public Criteria andCanOffIsNull() {
            addCriterion("can_off is null");
            return (Criteria) this;
        }

        public Criteria andCanOffIsNotNull() {
            addCriterion("can_off is not null");
            return (Criteria) this;
        }

        public Criteria andCanOffEqualTo(Boolean value) {
            addCriterion("can_off =", value, "canOff");
            return (Criteria) this;
        }

        public Criteria andCanOffNotEqualTo(Boolean value) {
            addCriterion("can_off <>", value, "canOff");
            return (Criteria) this;
        }

        public Criteria andCanOffGreaterThan(Boolean value) {
            addCriterion("can_off >", value, "canOff");
            return (Criteria) this;
        }

        public Criteria andCanOffGreaterThanOrEqualTo(Boolean value) {
            addCriterion("can_off >=", value, "canOff");
            return (Criteria) this;
        }

        public Criteria andCanOffLessThan(Boolean value) {
            addCriterion("can_off <", value, "canOff");
            return (Criteria) this;
        }

        public Criteria andCanOffLessThanOrEqualTo(Boolean value) {
            addCriterion("can_off <=", value, "canOff");
            return (Criteria) this;
        }

        public Criteria andCanOffIn(List<Boolean> values) {
            addCriterion("can_off in", values, "canOff");
            return (Criteria) this;
        }

        public Criteria andCanOffNotIn(List<Boolean> values) {
            addCriterion("can_off not in", values, "canOff");
            return (Criteria) this;
        }

        public Criteria andCanOffBetween(Boolean value1, Boolean value2) {
            addCriterion("can_off between", value1, value2, "canOff");
            return (Criteria) this;
        }

        public Criteria andCanOffNotBetween(Boolean value1, Boolean value2) {
            addCriterion("can_off not between", value1, value2, "canOff");
            return (Criteria) this;
        }

        public Criteria andNGroupIdIsNull() {
            addCriterion("n_group_id is null");
            return (Criteria) this;
        }

        public Criteria andNGroupIdIsNotNull() {
            addCriterion("n_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andNGroupIdEqualTo(Integer value) {
            addCriterion("n_group_id =", value, "nGroupId");
            return (Criteria) this;
        }

        public Criteria andNGroupIdNotEqualTo(Integer value) {
            addCriterion("n_group_id <>", value, "nGroupId");
            return (Criteria) this;
        }

        public Criteria andNGroupIdGreaterThan(Integer value) {
            addCriterion("n_group_id >", value, "nGroupId");
            return (Criteria) this;
        }

        public Criteria andNGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_group_id >=", value, "nGroupId");
            return (Criteria) this;
        }

        public Criteria andNGroupIdLessThan(Integer value) {
            addCriterion("n_group_id <", value, "nGroupId");
            return (Criteria) this;
        }

        public Criteria andNGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_group_id <=", value, "nGroupId");
            return (Criteria) this;
        }

        public Criteria andNGroupIdIn(List<Integer> values) {
            addCriterion("n_group_id in", values, "nGroupId");
            return (Criteria) this;
        }

        public Criteria andNGroupIdNotIn(List<Integer> values) {
            addCriterion("n_group_id not in", values, "nGroupId");
            return (Criteria) this;
        }

        public Criteria andNGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("n_group_id between", value1, value2, "nGroupId");
            return (Criteria) this;
        }

        public Criteria andNGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_group_id not between", value1, value2, "nGroupId");
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

        public Criteria andIsComboIsNull() {
            addCriterion("is_combo is null");
            return (Criteria) this;
        }

        public Criteria andIsComboIsNotNull() {
            addCriterion("is_combo is not null");
            return (Criteria) this;
        }

        public Criteria andIsComboEqualTo(Boolean value) {
            addCriterion("is_combo =", value, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboNotEqualTo(Boolean value) {
            addCriterion("is_combo <>", value, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboGreaterThan(Boolean value) {
            addCriterion("is_combo >", value, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_combo >=", value, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboLessThan(Boolean value) {
            addCriterion("is_combo <", value, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboLessThanOrEqualTo(Boolean value) {
            addCriterion("is_combo <=", value, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboIn(List<Boolean> values) {
            addCriterion("is_combo in", values, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboNotIn(List<Boolean> values) {
            addCriterion("is_combo not in", values, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboBetween(Boolean value1, Boolean value2) {
            addCriterion("is_combo between", value1, value2, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_combo not between", value1, value2, "isCombo");
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

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andNUnitIsNull() {
            addCriterion("n_unit is null");
            return (Criteria) this;
        }

        public Criteria andNUnitIsNotNull() {
            addCriterion("n_unit is not null");
            return (Criteria) this;
        }

        public Criteria andNUnitEqualTo(String value) {
            addCriterion("n_unit =", value, "nUnit");
            return (Criteria) this;
        }

        public Criteria andNUnitNotEqualTo(String value) {
            addCriterion("n_unit <>", value, "nUnit");
            return (Criteria) this;
        }

        public Criteria andNUnitGreaterThan(String value) {
            addCriterion("n_unit >", value, "nUnit");
            return (Criteria) this;
        }

        public Criteria andNUnitGreaterThanOrEqualTo(String value) {
            addCriterion("n_unit >=", value, "nUnit");
            return (Criteria) this;
        }

        public Criteria andNUnitLessThan(String value) {
            addCriterion("n_unit <", value, "nUnit");
            return (Criteria) this;
        }

        public Criteria andNUnitLessThanOrEqualTo(String value) {
            addCriterion("n_unit <=", value, "nUnit");
            return (Criteria) this;
        }

        public Criteria andNUnitLike(String value) {
            addCriterion("n_unit like", value, "nUnit");
            return (Criteria) this;
        }

        public Criteria andNUnitNotLike(String value) {
            addCriterion("n_unit not like", value, "nUnit");
            return (Criteria) this;
        }

        public Criteria andNUnitIn(List<String> values) {
            addCriterion("n_unit in", values, "nUnit");
            return (Criteria) this;
        }

        public Criteria andNUnitNotIn(List<String> values) {
            addCriterion("n_unit not in", values, "nUnit");
            return (Criteria) this;
        }

        public Criteria andNUnitBetween(String value1, String value2) {
            addCriterion("n_unit between", value1, value2, "nUnit");
            return (Criteria) this;
        }

        public Criteria andNUnitNotBetween(String value1, String value2) {
            addCriterion("n_unit not between", value1, value2, "nUnit");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceIsNull() {
            addCriterion("other_choice is null");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceIsNotNull() {
            addCriterion("other_choice is not null");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceEqualTo(String value) {
            addCriterion("other_choice =", value, "otherChoice");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceNotEqualTo(String value) {
            addCriterion("other_choice <>", value, "otherChoice");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceGreaterThan(String value) {
            addCriterion("other_choice >", value, "otherChoice");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceGreaterThanOrEqualTo(String value) {
            addCriterion("other_choice >=", value, "otherChoice");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceLessThan(String value) {
            addCriterion("other_choice <", value, "otherChoice");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceLessThanOrEqualTo(String value) {
            addCriterion("other_choice <=", value, "otherChoice");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceLike(String value) {
            addCriterion("other_choice like", value, "otherChoice");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceNotLike(String value) {
            addCriterion("other_choice not like", value, "otherChoice");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceIn(List<String> values) {
            addCriterion("other_choice in", values, "otherChoice");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceNotIn(List<String> values) {
            addCriterion("other_choice not in", values, "otherChoice");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceBetween(String value1, String value2) {
            addCriterion("other_choice between", value1, value2, "otherChoice");
            return (Criteria) this;
        }

        public Criteria andOtherChoiceNotBetween(String value1, String value2) {
            addCriterion("other_choice not between", value1, value2, "otherChoice");
            return (Criteria) this;
        }

        public Criteria andIncludeIdIsNull() {
            addCriterion("include_id is null");
            return (Criteria) this;
        }

        public Criteria andIncludeIdIsNotNull() {
            addCriterion("include_id is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeIdEqualTo(String value) {
            addCriterion("include_id =", value, "includeId");
            return (Criteria) this;
        }

        public Criteria andIncludeIdNotEqualTo(String value) {
            addCriterion("include_id <>", value, "includeId");
            return (Criteria) this;
        }

        public Criteria andIncludeIdGreaterThan(String value) {
            addCriterion("include_id >", value, "includeId");
            return (Criteria) this;
        }

        public Criteria andIncludeIdGreaterThanOrEqualTo(String value) {
            addCriterion("include_id >=", value, "includeId");
            return (Criteria) this;
        }

        public Criteria andIncludeIdLessThan(String value) {
            addCriterion("include_id <", value, "includeId");
            return (Criteria) this;
        }

        public Criteria andIncludeIdLessThanOrEqualTo(String value) {
            addCriterion("include_id <=", value, "includeId");
            return (Criteria) this;
        }

        public Criteria andIncludeIdLike(String value) {
            addCriterion("include_id like", value, "includeId");
            return (Criteria) this;
        }

        public Criteria andIncludeIdNotLike(String value) {
            addCriterion("include_id not like", value, "includeId");
            return (Criteria) this;
        }

        public Criteria andIncludeIdIn(List<String> values) {
            addCriterion("include_id in", values, "includeId");
            return (Criteria) this;
        }

        public Criteria andIncludeIdNotIn(List<String> values) {
            addCriterion("include_id not in", values, "includeId");
            return (Criteria) this;
        }

        public Criteria andIncludeIdBetween(String value1, String value2) {
            addCriterion("include_id between", value1, value2, "includeId");
            return (Criteria) this;
        }

        public Criteria andIncludeIdNotBetween(String value1, String value2) {
            addCriterion("include_id not between", value1, value2, "includeId");
            return (Criteria) this;
        }

        public Criteria andTicketFlagIsNull() {
            addCriterion("ticket_flag is null");
            return (Criteria) this;
        }

        public Criteria andTicketFlagIsNotNull() {
            addCriterion("ticket_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTicketFlagEqualTo(Boolean value) {
            addCriterion("ticket_flag =", value, "ticketFlag");
            return (Criteria) this;
        }

        public Criteria andTicketFlagNotEqualTo(Boolean value) {
            addCriterion("ticket_flag <>", value, "ticketFlag");
            return (Criteria) this;
        }

        public Criteria andTicketFlagGreaterThan(Boolean value) {
            addCriterion("ticket_flag >", value, "ticketFlag");
            return (Criteria) this;
        }

        public Criteria andTicketFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ticket_flag >=", value, "ticketFlag");
            return (Criteria) this;
        }

        public Criteria andTicketFlagLessThan(Boolean value) {
            addCriterion("ticket_flag <", value, "ticketFlag");
            return (Criteria) this;
        }

        public Criteria andTicketFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("ticket_flag <=", value, "ticketFlag");
            return (Criteria) this;
        }

        public Criteria andTicketFlagIn(List<Boolean> values) {
            addCriterion("ticket_flag in", values, "ticketFlag");
            return (Criteria) this;
        }

        public Criteria andTicketFlagNotIn(List<Boolean> values) {
            addCriterion("ticket_flag not in", values, "ticketFlag");
            return (Criteria) this;
        }

        public Criteria andTicketFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("ticket_flag between", value1, value2, "ticketFlag");
            return (Criteria) this;
        }

        public Criteria andTicketFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ticket_flag not between", value1, value2, "ticketFlag");
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