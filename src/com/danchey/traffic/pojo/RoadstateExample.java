package com.danchey.traffic.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoadstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoadstateExample() {
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

        public Criteria andRoadnameIsNull() {
            addCriterion("roadName is null");
            return (Criteria) this;
        }

        public Criteria andRoadnameIsNotNull() {
            addCriterion("roadName is not null");
            return (Criteria) this;
        }

        public Criteria andRoadnameEqualTo(String value) {
            addCriterion("roadName =", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameNotEqualTo(String value) {
            addCriterion("roadName <>", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameGreaterThan(String value) {
            addCriterion("roadName >", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameGreaterThanOrEqualTo(String value) {
            addCriterion("roadName >=", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameLessThan(String value) {
            addCriterion("roadName <", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameLessThanOrEqualTo(String value) {
            addCriterion("roadName <=", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameLike(String value) {
            addCriterion("roadName like", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameNotLike(String value) {
            addCriterion("roadName not like", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameIn(List<String> values) {
            addCriterion("roadName in", values, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameNotIn(List<String> values) {
            addCriterion("roadName not in", values, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameBetween(String value1, String value2) {
            addCriterion("roadName between", value1, value2, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameNotBetween(String value1, String value2) {
            addCriterion("roadName not between", value1, value2, "roadname");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(BigDecimal value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(BigDecimal value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(BigDecimal value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(BigDecimal value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<BigDecimal> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<BigDecimal> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andInclineIsNull() {
            addCriterion("incline is null");
            return (Criteria) this;
        }

        public Criteria andInclineIsNotNull() {
            addCriterion("incline is not null");
            return (Criteria) this;
        }

        public Criteria andInclineEqualTo(BigDecimal value) {
            addCriterion("incline =", value, "incline");
            return (Criteria) this;
        }

        public Criteria andInclineNotEqualTo(BigDecimal value) {
            addCriterion("incline <>", value, "incline");
            return (Criteria) this;
        }

        public Criteria andInclineGreaterThan(BigDecimal value) {
            addCriterion("incline >", value, "incline");
            return (Criteria) this;
        }

        public Criteria andInclineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("incline >=", value, "incline");
            return (Criteria) this;
        }

        public Criteria andInclineLessThan(BigDecimal value) {
            addCriterion("incline <", value, "incline");
            return (Criteria) this;
        }

        public Criteria andInclineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("incline <=", value, "incline");
            return (Criteria) this;
        }

        public Criteria andInclineIn(List<BigDecimal> values) {
            addCriterion("incline in", values, "incline");
            return (Criteria) this;
        }

        public Criteria andInclineNotIn(List<BigDecimal> values) {
            addCriterion("incline not in", values, "incline");
            return (Criteria) this;
        }

        public Criteria andInclineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("incline between", value1, value2, "incline");
            return (Criteria) this;
        }

        public Criteria andInclineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("incline not between", value1, value2, "incline");
            return (Criteria) this;
        }

        public Criteria andSectionIsNull() {
            addCriterion("section is null");
            return (Criteria) this;
        }

        public Criteria andSectionIsNotNull() {
            addCriterion("section is not null");
            return (Criteria) this;
        }

        public Criteria andSectionEqualTo(String value) {
            addCriterion("section =", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotEqualTo(String value) {
            addCriterion("section <>", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThan(String value) {
            addCriterion("section >", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThanOrEqualTo(String value) {
            addCriterion("section >=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThan(String value) {
            addCriterion("section <", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThanOrEqualTo(String value) {
            addCriterion("section <=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLike(String value) {
            addCriterion("section like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotLike(String value) {
            addCriterion("section not like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionIn(List<String> values) {
            addCriterion("section in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotIn(List<String> values) {
            addCriterion("section not in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionBetween(String value1, String value2) {
            addCriterion("section between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotBetween(String value1, String value2) {
            addCriterion("section not between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andMotorwaywidthIsNull() {
            addCriterion("motorWayWidth is null");
            return (Criteria) this;
        }

        public Criteria andMotorwaywidthIsNotNull() {
            addCriterion("motorWayWidth is not null");
            return (Criteria) this;
        }

        public Criteria andMotorwaywidthEqualTo(BigDecimal value) {
            addCriterion("motorWayWidth =", value, "motorwaywidth");
            return (Criteria) this;
        }

        public Criteria andMotorwaywidthNotEqualTo(BigDecimal value) {
            addCriterion("motorWayWidth <>", value, "motorwaywidth");
            return (Criteria) this;
        }

        public Criteria andMotorwaywidthGreaterThan(BigDecimal value) {
            addCriterion("motorWayWidth >", value, "motorwaywidth");
            return (Criteria) this;
        }

        public Criteria andMotorwaywidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("motorWayWidth >=", value, "motorwaywidth");
            return (Criteria) this;
        }

        public Criteria andMotorwaywidthLessThan(BigDecimal value) {
            addCriterion("motorWayWidth <", value, "motorwaywidth");
            return (Criteria) this;
        }

        public Criteria andMotorwaywidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("motorWayWidth <=", value, "motorwaywidth");
            return (Criteria) this;
        }

        public Criteria andMotorwaywidthIn(List<BigDecimal> values) {
            addCriterion("motorWayWidth in", values, "motorwaywidth");
            return (Criteria) this;
        }

        public Criteria andMotorwaywidthNotIn(List<BigDecimal> values) {
            addCriterion("motorWayWidth not in", values, "motorwaywidth");
            return (Criteria) this;
        }

        public Criteria andMotorwaywidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("motorWayWidth between", value1, value2, "motorwaywidth");
            return (Criteria) this;
        }

        public Criteria andMotorwaywidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("motorWayWidth not between", value1, value2, "motorwaywidth");
            return (Criteria) this;
        }

        public Criteria andSuperwaywidthIsNull() {
            addCriterion("superWayWidth is null");
            return (Criteria) this;
        }

        public Criteria andSuperwaywidthIsNotNull() {
            addCriterion("superWayWidth is not null");
            return (Criteria) this;
        }

        public Criteria andSuperwaywidthEqualTo(BigDecimal value) {
            addCriterion("superWayWidth =", value, "superwaywidth");
            return (Criteria) this;
        }

        public Criteria andSuperwaywidthNotEqualTo(BigDecimal value) {
            addCriterion("superWayWidth <>", value, "superwaywidth");
            return (Criteria) this;
        }

        public Criteria andSuperwaywidthGreaterThan(BigDecimal value) {
            addCriterion("superWayWidth >", value, "superwaywidth");
            return (Criteria) this;
        }

        public Criteria andSuperwaywidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("superWayWidth >=", value, "superwaywidth");
            return (Criteria) this;
        }

        public Criteria andSuperwaywidthLessThan(BigDecimal value) {
            addCriterion("superWayWidth <", value, "superwaywidth");
            return (Criteria) this;
        }

        public Criteria andSuperwaywidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("superWayWidth <=", value, "superwaywidth");
            return (Criteria) this;
        }

        public Criteria andSuperwaywidthIn(List<BigDecimal> values) {
            addCriterion("superWayWidth in", values, "superwaywidth");
            return (Criteria) this;
        }

        public Criteria andSuperwaywidthNotIn(List<BigDecimal> values) {
            addCriterion("superWayWidth not in", values, "superwaywidth");
            return (Criteria) this;
        }

        public Criteria andSuperwaywidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("superWayWidth between", value1, value2, "superwaywidth");
            return (Criteria) this;
        }

        public Criteria andSuperwaywidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("superWayWidth not between", value1, value2, "superwaywidth");
            return (Criteria) this;
        }

        public Criteria andPavementwidthIsNull() {
            addCriterion("pavementWidth is null");
            return (Criteria) this;
        }

        public Criteria andPavementwidthIsNotNull() {
            addCriterion("pavementWidth is not null");
            return (Criteria) this;
        }

        public Criteria andPavementwidthEqualTo(BigDecimal value) {
            addCriterion("pavementWidth =", value, "pavementwidth");
            return (Criteria) this;
        }

        public Criteria andPavementwidthNotEqualTo(BigDecimal value) {
            addCriterion("pavementWidth <>", value, "pavementwidth");
            return (Criteria) this;
        }

        public Criteria andPavementwidthGreaterThan(BigDecimal value) {
            addCriterion("pavementWidth >", value, "pavementwidth");
            return (Criteria) this;
        }

        public Criteria andPavementwidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pavementWidth >=", value, "pavementwidth");
            return (Criteria) this;
        }

        public Criteria andPavementwidthLessThan(BigDecimal value) {
            addCriterion("pavementWidth <", value, "pavementwidth");
            return (Criteria) this;
        }

        public Criteria andPavementwidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pavementWidth <=", value, "pavementwidth");
            return (Criteria) this;
        }

        public Criteria andPavementwidthIn(List<BigDecimal> values) {
            addCriterion("pavementWidth in", values, "pavementwidth");
            return (Criteria) this;
        }

        public Criteria andPavementwidthNotIn(List<BigDecimal> values) {
            addCriterion("pavementWidth not in", values, "pavementwidth");
            return (Criteria) this;
        }

        public Criteria andPavementwidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pavementWidth between", value1, value2, "pavementwidth");
            return (Criteria) this;
        }

        public Criteria andPavementwidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pavementWidth not between", value1, value2, "pavementwidth");
            return (Criteria) this;
        }

        public Criteria andMedianwidthIsNull() {
            addCriterion("medianWidth is null");
            return (Criteria) this;
        }

        public Criteria andMedianwidthIsNotNull() {
            addCriterion("medianWidth is not null");
            return (Criteria) this;
        }

        public Criteria andMedianwidthEqualTo(BigDecimal value) {
            addCriterion("medianWidth =", value, "medianwidth");
            return (Criteria) this;
        }

        public Criteria andMedianwidthNotEqualTo(BigDecimal value) {
            addCriterion("medianWidth <>", value, "medianwidth");
            return (Criteria) this;
        }

        public Criteria andMedianwidthGreaterThan(BigDecimal value) {
            addCriterion("medianWidth >", value, "medianwidth");
            return (Criteria) this;
        }

        public Criteria andMedianwidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("medianWidth >=", value, "medianwidth");
            return (Criteria) this;
        }

        public Criteria andMedianwidthLessThan(BigDecimal value) {
            addCriterion("medianWidth <", value, "medianwidth");
            return (Criteria) this;
        }

        public Criteria andMedianwidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("medianWidth <=", value, "medianwidth");
            return (Criteria) this;
        }

        public Criteria andMedianwidthIn(List<BigDecimal> values) {
            addCriterion("medianWidth in", values, "medianwidth");
            return (Criteria) this;
        }

        public Criteria andMedianwidthNotIn(List<BigDecimal> values) {
            addCriterion("medianWidth not in", values, "medianwidth");
            return (Criteria) this;
        }

        public Criteria andMedianwidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medianWidth between", value1, value2, "medianwidth");
            return (Criteria) this;
        }

        public Criteria andMedianwidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medianWidth not between", value1, value2, "medianwidth");
            return (Criteria) this;
        }

        public Criteria andSidesseparatebeltwidthIsNull() {
            addCriterion("sidesSeparateBeltWidth is null");
            return (Criteria) this;
        }

        public Criteria andSidesseparatebeltwidthIsNotNull() {
            addCriterion("sidesSeparateBeltWidth is not null");
            return (Criteria) this;
        }

        public Criteria andSidesseparatebeltwidthEqualTo(BigDecimal value) {
            addCriterion("sidesSeparateBeltWidth =", value, "sidesseparatebeltwidth");
            return (Criteria) this;
        }

        public Criteria andSidesseparatebeltwidthNotEqualTo(BigDecimal value) {
            addCriterion("sidesSeparateBeltWidth <>", value, "sidesseparatebeltwidth");
            return (Criteria) this;
        }

        public Criteria andSidesseparatebeltwidthGreaterThan(BigDecimal value) {
            addCriterion("sidesSeparateBeltWidth >", value, "sidesseparatebeltwidth");
            return (Criteria) this;
        }

        public Criteria andSidesseparatebeltwidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sidesSeparateBeltWidth >=", value, "sidesseparatebeltwidth");
            return (Criteria) this;
        }

        public Criteria andSidesseparatebeltwidthLessThan(BigDecimal value) {
            addCriterion("sidesSeparateBeltWidth <", value, "sidesseparatebeltwidth");
            return (Criteria) this;
        }

        public Criteria andSidesseparatebeltwidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sidesSeparateBeltWidth <=", value, "sidesseparatebeltwidth");
            return (Criteria) this;
        }

        public Criteria andSidesseparatebeltwidthIn(List<BigDecimal> values) {
            addCriterion("sidesSeparateBeltWidth in", values, "sidesseparatebeltwidth");
            return (Criteria) this;
        }

        public Criteria andSidesseparatebeltwidthNotIn(List<BigDecimal> values) {
            addCriterion("sidesSeparateBeltWidth not in", values, "sidesseparatebeltwidth");
            return (Criteria) this;
        }

        public Criteria andSidesseparatebeltwidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sidesSeparateBeltWidth between", value1, value2, "sidesseparatebeltwidth");
            return (Criteria) this;
        }

        public Criteria andSidesseparatebeltwidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sidesSeparateBeltWidth not between", value1, value2, "sidesseparatebeltwidth");
            return (Criteria) this;
        }

        public Criteria andRedlinewidthIsNull() {
            addCriterion("redLineWidth is null");
            return (Criteria) this;
        }

        public Criteria andRedlinewidthIsNotNull() {
            addCriterion("redLineWidth is not null");
            return (Criteria) this;
        }

        public Criteria andRedlinewidthEqualTo(BigDecimal value) {
            addCriterion("redLineWidth =", value, "redlinewidth");
            return (Criteria) this;
        }

        public Criteria andRedlinewidthNotEqualTo(BigDecimal value) {
            addCriterion("redLineWidth <>", value, "redlinewidth");
            return (Criteria) this;
        }

        public Criteria andRedlinewidthGreaterThan(BigDecimal value) {
            addCriterion("redLineWidth >", value, "redlinewidth");
            return (Criteria) this;
        }

        public Criteria andRedlinewidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("redLineWidth >=", value, "redlinewidth");
            return (Criteria) this;
        }

        public Criteria andRedlinewidthLessThan(BigDecimal value) {
            addCriterion("redLineWidth <", value, "redlinewidth");
            return (Criteria) this;
        }

        public Criteria andRedlinewidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("redLineWidth <=", value, "redlinewidth");
            return (Criteria) this;
        }

        public Criteria andRedlinewidthIn(List<BigDecimal> values) {
            addCriterion("redLineWidth in", values, "redlinewidth");
            return (Criteria) this;
        }

        public Criteria andRedlinewidthNotIn(List<BigDecimal> values) {
            addCriterion("redLineWidth not in", values, "redlinewidth");
            return (Criteria) this;
        }

        public Criteria andRedlinewidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("redLineWidth between", value1, value2, "redlinewidth");
            return (Criteria) this;
        }

        public Criteria andRedlinewidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("redLineWidth not between", value1, value2, "redlinewidth");
            return (Criteria) this;
        }

        public Criteria andStartIsNull() {
            addCriterion("start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(String value) {
            addCriterion("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(String value) {
            addCriterion("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(String value) {
            addCriterion("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(String value) {
            addCriterion("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(String value) {
            addCriterion("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(String value) {
            addCriterion("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLike(String value) {
            addCriterion("start like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotLike(String value) {
            addCriterion("start not like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<String> values) {
            addCriterion("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<String> values) {
            addCriterion("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(String value1, String value2) {
            addCriterion("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(String value1, String value2) {
            addCriterion("start not between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andEndIsNull() {
            addCriterion("end is null");
            return (Criteria) this;
        }

        public Criteria andEndIsNotNull() {
            addCriterion("end is not null");
            return (Criteria) this;
        }

        public Criteria andEndEqualTo(String value) {
            addCriterion("end =", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotEqualTo(String value) {
            addCriterion("end <>", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThan(String value) {
            addCriterion("end >", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThanOrEqualTo(String value) {
            addCriterion("end >=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThan(String value) {
            addCriterion("end <", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThanOrEqualTo(String value) {
            addCriterion("end <=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLike(String value) {
            addCriterion("end like", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotLike(String value) {
            addCriterion("end not like", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndIn(List<String> values) {
            addCriterion("end in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotIn(List<String> values) {
            addCriterion("end not in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndBetween(String value1, String value2) {
            addCriterion("end between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotBetween(String value1, String value2) {
            addCriterion("end not between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andRoadlevelIdIsNull() {
            addCriterion("roadLevel_id is null");
            return (Criteria) this;
        }

        public Criteria andRoadlevelIdIsNotNull() {
            addCriterion("roadLevel_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoadlevelIdEqualTo(Integer value) {
            addCriterion("roadLevel_id =", value, "roadlevelId");
            return (Criteria) this;
        }

        public Criteria andRoadlevelIdNotEqualTo(Integer value) {
            addCriterion("roadLevel_id <>", value, "roadlevelId");
            return (Criteria) this;
        }

        public Criteria andRoadlevelIdGreaterThan(Integer value) {
            addCriterion("roadLevel_id >", value, "roadlevelId");
            return (Criteria) this;
        }

        public Criteria andRoadlevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roadLevel_id >=", value, "roadlevelId");
            return (Criteria) this;
        }

        public Criteria andRoadlevelIdLessThan(Integer value) {
            addCriterion("roadLevel_id <", value, "roadlevelId");
            return (Criteria) this;
        }

        public Criteria andRoadlevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("roadLevel_id <=", value, "roadlevelId");
            return (Criteria) this;
        }

        public Criteria andRoadlevelIdIn(List<Integer> values) {
            addCriterion("roadLevel_id in", values, "roadlevelId");
            return (Criteria) this;
        }

        public Criteria andRoadlevelIdNotIn(List<Integer> values) {
            addCriterion("roadLevel_id not in", values, "roadlevelId");
            return (Criteria) this;
        }

        public Criteria andRoadlevelIdBetween(Integer value1, Integer value2) {
            addCriterion("roadLevel_id between", value1, value2, "roadlevelId");
            return (Criteria) this;
        }

        public Criteria andRoadlevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roadLevel_id not between", value1, value2, "roadlevelId");
            return (Criteria) this;
        }

        public Criteria andRoadbedtypeIdIsNull() {
            addCriterion("roadbedType_id is null");
            return (Criteria) this;
        }

        public Criteria andRoadbedtypeIdIsNotNull() {
            addCriterion("roadbedType_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoadbedtypeIdEqualTo(Integer value) {
            addCriterion("roadbedType_id =", value, "roadbedtypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedtypeIdNotEqualTo(Integer value) {
            addCriterion("roadbedType_id <>", value, "roadbedtypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedtypeIdGreaterThan(Integer value) {
            addCriterion("roadbedType_id >", value, "roadbedtypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedtypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roadbedType_id >=", value, "roadbedtypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedtypeIdLessThan(Integer value) {
            addCriterion("roadbedType_id <", value, "roadbedtypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedtypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("roadbedType_id <=", value, "roadbedtypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedtypeIdIn(List<Integer> values) {
            addCriterion("roadbedType_id in", values, "roadbedtypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedtypeIdNotIn(List<Integer> values) {
            addCriterion("roadbedType_id not in", values, "roadbedtypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedtypeIdBetween(Integer value1, Integer value2) {
            addCriterion("roadbedType_id between", value1, value2, "roadbedtypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedtypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roadbedType_id not between", value1, value2, "roadbedtypeId");
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