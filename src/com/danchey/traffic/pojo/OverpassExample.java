package com.danchey.traffic.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OverpassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OverpassExample() {
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

        public Criteria andSurveytimeIsNull() {
            addCriterion("surveyTime is null");
            return (Criteria) this;
        }

        public Criteria andSurveytimeIsNotNull() {
            addCriterion("surveyTime is not null");
            return (Criteria) this;
        }

        public Criteria andSurveytimeEqualTo(Date value) {
            addCriterionForJDBCDate("surveyTime =", value, "surveytime");
            return (Criteria) this;
        }

        public Criteria andSurveytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("surveyTime <>", value, "surveytime");
            return (Criteria) this;
        }

        public Criteria andSurveytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("surveyTime >", value, "surveytime");
            return (Criteria) this;
        }

        public Criteria andSurveytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("surveyTime >=", value, "surveytime");
            return (Criteria) this;
        }

        public Criteria andSurveytimeLessThan(Date value) {
            addCriterionForJDBCDate("surveyTime <", value, "surveytime");
            return (Criteria) this;
        }

        public Criteria andSurveytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("surveyTime <=", value, "surveytime");
            return (Criteria) this;
        }

        public Criteria andSurveytimeIn(List<Date> values) {
            addCriterionForJDBCDate("surveyTime in", values, "surveytime");
            return (Criteria) this;
        }

        public Criteria andSurveytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("surveyTime not in", values, "surveytime");
            return (Criteria) this;
        }

        public Criteria andSurveytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("surveyTime between", value1, value2, "surveytime");
            return (Criteria) this;
        }

        public Criteria andSurveytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("surveyTime not between", value1, value2, "surveytime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andInvestigatorIsNull() {
            addCriterion("investigator is null");
            return (Criteria) this;
        }

        public Criteria andInvestigatorIsNotNull() {
            addCriterion("investigator is not null");
            return (Criteria) this;
        }

        public Criteria andInvestigatorEqualTo(String value) {
            addCriterion("investigator =", value, "investigator");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNotEqualTo(String value) {
            addCriterion("investigator <>", value, "investigator");
            return (Criteria) this;
        }

        public Criteria andInvestigatorGreaterThan(String value) {
            addCriterion("investigator >", value, "investigator");
            return (Criteria) this;
        }

        public Criteria andInvestigatorGreaterThanOrEqualTo(String value) {
            addCriterion("investigator >=", value, "investigator");
            return (Criteria) this;
        }

        public Criteria andInvestigatorLessThan(String value) {
            addCriterion("investigator <", value, "investigator");
            return (Criteria) this;
        }

        public Criteria andInvestigatorLessThanOrEqualTo(String value) {
            addCriterion("investigator <=", value, "investigator");
            return (Criteria) this;
        }

        public Criteria andInvestigatorLike(String value) {
            addCriterion("investigator like", value, "investigator");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNotLike(String value) {
            addCriterion("investigator not like", value, "investigator");
            return (Criteria) this;
        }

        public Criteria andInvestigatorIn(List<String> values) {
            addCriterion("investigator in", values, "investigator");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNotIn(List<String> values) {
            addCriterion("investigator not in", values, "investigator");
            return (Criteria) this;
        }

        public Criteria andInvestigatorBetween(String value1, String value2) {
            addCriterion("investigator between", value1, value2, "investigator");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNotBetween(String value1, String value2) {
            addCriterion("investigator not between", value1, value2, "investigator");
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

        public Criteria andHasaddIsNull() {
            addCriterion("hasAdd is null");
            return (Criteria) this;
        }

        public Criteria andHasaddIsNotNull() {
            addCriterion("hasAdd is not null");
            return (Criteria) this;
        }

        public Criteria andHasaddEqualTo(Boolean value) {
            addCriterion("hasAdd =", value, "hasadd");
            return (Criteria) this;
        }

        public Criteria andHasaddNotEqualTo(Boolean value) {
            addCriterion("hasAdd <>", value, "hasadd");
            return (Criteria) this;
        }

        public Criteria andHasaddGreaterThan(Boolean value) {
            addCriterion("hasAdd >", value, "hasadd");
            return (Criteria) this;
        }

        public Criteria andHasaddGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasAdd >=", value, "hasadd");
            return (Criteria) this;
        }

        public Criteria andHasaddLessThan(Boolean value) {
            addCriterion("hasAdd <", value, "hasadd");
            return (Criteria) this;
        }

        public Criteria andHasaddLessThanOrEqualTo(Boolean value) {
            addCriterion("hasAdd <=", value, "hasadd");
            return (Criteria) this;
        }

        public Criteria andHasaddIn(List<Boolean> values) {
            addCriterion("hasAdd in", values, "hasadd");
            return (Criteria) this;
        }

        public Criteria andHasaddNotIn(List<Boolean> values) {
            addCriterion("hasAdd not in", values, "hasadd");
            return (Criteria) this;
        }

        public Criteria andHasaddBetween(Boolean value1, Boolean value2) {
            addCriterion("hasAdd between", value1, value2, "hasadd");
            return (Criteria) this;
        }

        public Criteria andHasaddNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasAdd not between", value1, value2, "hasadd");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("radius is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("radius is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(BigDecimal value) {
            addCriterion("radius =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(BigDecimal value) {
            addCriterion("radius <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(BigDecimal value) {
            addCriterion("radius >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("radius >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(BigDecimal value) {
            addCriterion("radius <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("radius <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<BigDecimal> values) {
            addCriterion("radius in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<BigDecimal> values) {
            addCriterion("radius not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("radius between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("radius not between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andLongitudinalgradeIsNull() {
            addCriterion("longitudinalGrade is null");
            return (Criteria) this;
        }

        public Criteria andLongitudinalgradeIsNotNull() {
            addCriterion("longitudinalGrade is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudinalgradeEqualTo(BigDecimal value) {
            addCriterion("longitudinalGrade =", value, "longitudinalgrade");
            return (Criteria) this;
        }

        public Criteria andLongitudinalgradeNotEqualTo(BigDecimal value) {
            addCriterion("longitudinalGrade <>", value, "longitudinalgrade");
            return (Criteria) this;
        }

        public Criteria andLongitudinalgradeGreaterThan(BigDecimal value) {
            addCriterion("longitudinalGrade >", value, "longitudinalgrade");
            return (Criteria) this;
        }

        public Criteria andLongitudinalgradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitudinalGrade >=", value, "longitudinalgrade");
            return (Criteria) this;
        }

        public Criteria andLongitudinalgradeLessThan(BigDecimal value) {
            addCriterion("longitudinalGrade <", value, "longitudinalgrade");
            return (Criteria) this;
        }

        public Criteria andLongitudinalgradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitudinalGrade <=", value, "longitudinalgrade");
            return (Criteria) this;
        }

        public Criteria andLongitudinalgradeIn(List<BigDecimal> values) {
            addCriterion("longitudinalGrade in", values, "longitudinalgrade");
            return (Criteria) this;
        }

        public Criteria andLongitudinalgradeNotIn(List<BigDecimal> values) {
            addCriterion("longitudinalGrade not in", values, "longitudinalgrade");
            return (Criteria) this;
        }

        public Criteria andLongitudinalgradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitudinalGrade between", value1, value2, "longitudinalgrade");
            return (Criteria) this;
        }

        public Criteria andLongitudinalgradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitudinalGrade not between", value1, value2, "longitudinalgrade");
            return (Criteria) this;
        }

        public Criteria andDisturbanceIsNull() {
            addCriterion("disturbance is null");
            return (Criteria) this;
        }

        public Criteria andDisturbanceIsNotNull() {
            addCriterion("disturbance is not null");
            return (Criteria) this;
        }

        public Criteria andDisturbanceEqualTo(String value) {
            addCriterion("disturbance =", value, "disturbance");
            return (Criteria) this;
        }

        public Criteria andDisturbanceNotEqualTo(String value) {
            addCriterion("disturbance <>", value, "disturbance");
            return (Criteria) this;
        }

        public Criteria andDisturbanceGreaterThan(String value) {
            addCriterion("disturbance >", value, "disturbance");
            return (Criteria) this;
        }

        public Criteria andDisturbanceGreaterThanOrEqualTo(String value) {
            addCriterion("disturbance >=", value, "disturbance");
            return (Criteria) this;
        }

        public Criteria andDisturbanceLessThan(String value) {
            addCriterion("disturbance <", value, "disturbance");
            return (Criteria) this;
        }

        public Criteria andDisturbanceLessThanOrEqualTo(String value) {
            addCriterion("disturbance <=", value, "disturbance");
            return (Criteria) this;
        }

        public Criteria andDisturbanceLike(String value) {
            addCriterion("disturbance like", value, "disturbance");
            return (Criteria) this;
        }

        public Criteria andDisturbanceNotLike(String value) {
            addCriterion("disturbance not like", value, "disturbance");
            return (Criteria) this;
        }

        public Criteria andDisturbanceIn(List<String> values) {
            addCriterion("disturbance in", values, "disturbance");
            return (Criteria) this;
        }

        public Criteria andDisturbanceNotIn(List<String> values) {
            addCriterion("disturbance not in", values, "disturbance");
            return (Criteria) this;
        }

        public Criteria andDisturbanceBetween(String value1, String value2) {
            addCriterion("disturbance between", value1, value2, "disturbance");
            return (Criteria) this;
        }

        public Criteria andDisturbanceNotBetween(String value1, String value2) {
            addCriterion("disturbance not between", value1, value2, "disturbance");
            return (Criteria) this;
        }

        public Criteria andHasstationIsNull() {
            addCriterion("hasStation is null");
            return (Criteria) this;
        }

        public Criteria andHasstationIsNotNull() {
            addCriterion("hasStation is not null");
            return (Criteria) this;
        }

        public Criteria andHasstationEqualTo(Boolean value) {
            addCriterion("hasStation =", value, "hasstation");
            return (Criteria) this;
        }

        public Criteria andHasstationNotEqualTo(Boolean value) {
            addCriterion("hasStation <>", value, "hasstation");
            return (Criteria) this;
        }

        public Criteria andHasstationGreaterThan(Boolean value) {
            addCriterion("hasStation >", value, "hasstation");
            return (Criteria) this;
        }

        public Criteria andHasstationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasStation >=", value, "hasstation");
            return (Criteria) this;
        }

        public Criteria andHasstationLessThan(Boolean value) {
            addCriterion("hasStation <", value, "hasstation");
            return (Criteria) this;
        }

        public Criteria andHasstationLessThanOrEqualTo(Boolean value) {
            addCriterion("hasStation <=", value, "hasstation");
            return (Criteria) this;
        }

        public Criteria andHasstationIn(List<Boolean> values) {
            addCriterion("hasStation in", values, "hasstation");
            return (Criteria) this;
        }

        public Criteria andHasstationNotIn(List<Boolean> values) {
            addCriterion("hasStation not in", values, "hasstation");
            return (Criteria) this;
        }

        public Criteria andHasstationBetween(Boolean value1, Boolean value2) {
            addCriterion("hasStation between", value1, value2, "hasstation");
            return (Criteria) this;
        }

        public Criteria andHasstationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasStation not between", value1, value2, "hasstation");
            return (Criteria) this;
        }

        public Criteria andRamptypeIdIsNull() {
            addCriterion("rampType_id is null");
            return (Criteria) this;
        }

        public Criteria andRamptypeIdIsNotNull() {
            addCriterion("rampType_id is not null");
            return (Criteria) this;
        }

        public Criteria andRamptypeIdEqualTo(Integer value) {
            addCriterion("rampType_id =", value, "ramptypeId");
            return (Criteria) this;
        }

        public Criteria andRamptypeIdNotEqualTo(Integer value) {
            addCriterion("rampType_id <>", value, "ramptypeId");
            return (Criteria) this;
        }

        public Criteria andRamptypeIdGreaterThan(Integer value) {
            addCriterion("rampType_id >", value, "ramptypeId");
            return (Criteria) this;
        }

        public Criteria andRamptypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rampType_id >=", value, "ramptypeId");
            return (Criteria) this;
        }

        public Criteria andRamptypeIdLessThan(Integer value) {
            addCriterion("rampType_id <", value, "ramptypeId");
            return (Criteria) this;
        }

        public Criteria andRamptypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("rampType_id <=", value, "ramptypeId");
            return (Criteria) this;
        }

        public Criteria andRamptypeIdIn(List<Integer> values) {
            addCriterion("rampType_id in", values, "ramptypeId");
            return (Criteria) this;
        }

        public Criteria andRamptypeIdNotIn(List<Integer> values) {
            addCriterion("rampType_id not in", values, "ramptypeId");
            return (Criteria) this;
        }

        public Criteria andRamptypeIdBetween(Integer value1, Integer value2) {
            addCriterion("rampType_id between", value1, value2, "ramptypeId");
            return (Criteria) this;
        }

        public Criteria andRamptypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rampType_id not between", value1, value2, "ramptypeId");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNull() {
            addCriterion("coordinate is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNotNull() {
            addCriterion("coordinate is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateEqualTo(String value) {
            addCriterion("coordinate =", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotEqualTo(String value) {
            addCriterion("coordinate <>", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThan(String value) {
            addCriterion("coordinate >", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("coordinate >=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThan(String value) {
            addCriterion("coordinate <", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThanOrEqualTo(String value) {
            addCriterion("coordinate <=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLike(String value) {
            addCriterion("coordinate like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotLike(String value) {
            addCriterion("coordinate not like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateIn(List<String> values) {
            addCriterion("coordinate in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotIn(List<String> values) {
            addCriterion("coordinate not in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateBetween(String value1, String value2) {
            addCriterion("coordinate between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotBetween(String value1, String value2) {
            addCriterion("coordinate not between", value1, value2, "coordinate");
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