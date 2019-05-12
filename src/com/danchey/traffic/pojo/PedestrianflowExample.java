package com.danchey.traffic.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PedestrianflowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PedestrianflowExample() {
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

        public Criteria andTotal10IsNull() {
            addCriterion("total_10 is null");
            return (Criteria) this;
        }

        public Criteria andTotal10IsNotNull() {
            addCriterion("total_10 is not null");
            return (Criteria) this;
        }

        public Criteria andTotal10EqualTo(Integer value) {
            addCriterion("total_10 =", value, "total10");
            return (Criteria) this;
        }

        public Criteria andTotal10NotEqualTo(Integer value) {
            addCriterion("total_10 <>", value, "total10");
            return (Criteria) this;
        }

        public Criteria andTotal10GreaterThan(Integer value) {
            addCriterion("total_10 >", value, "total10");
            return (Criteria) this;
        }

        public Criteria andTotal10GreaterThanOrEqualTo(Integer value) {
            addCriterion("total_10 >=", value, "total10");
            return (Criteria) this;
        }

        public Criteria andTotal10LessThan(Integer value) {
            addCriterion("total_10 <", value, "total10");
            return (Criteria) this;
        }

        public Criteria andTotal10LessThanOrEqualTo(Integer value) {
            addCriterion("total_10 <=", value, "total10");
            return (Criteria) this;
        }

        public Criteria andTotal10In(List<Integer> values) {
            addCriterion("total_10 in", values, "total10");
            return (Criteria) this;
        }

        public Criteria andTotal10NotIn(List<Integer> values) {
            addCriterion("total_10 not in", values, "total10");
            return (Criteria) this;
        }

        public Criteria andTotal10Between(Integer value1, Integer value2) {
            addCriterion("total_10 between", value1, value2, "total10");
            return (Criteria) this;
        }

        public Criteria andTotal10NotBetween(Integer value1, Integer value2) {
            addCriterion("total_10 not between", value1, value2, "total10");
            return (Criteria) this;
        }

        public Criteria andViolation10IsNull() {
            addCriterion("violation_10 is null");
            return (Criteria) this;
        }

        public Criteria andViolation10IsNotNull() {
            addCriterion("violation_10 is not null");
            return (Criteria) this;
        }

        public Criteria andViolation10EqualTo(Integer value) {
            addCriterion("violation_10 =", value, "violation10");
            return (Criteria) this;
        }

        public Criteria andViolation10NotEqualTo(Integer value) {
            addCriterion("violation_10 <>", value, "violation10");
            return (Criteria) this;
        }

        public Criteria andViolation10GreaterThan(Integer value) {
            addCriterion("violation_10 >", value, "violation10");
            return (Criteria) this;
        }

        public Criteria andViolation10GreaterThanOrEqualTo(Integer value) {
            addCriterion("violation_10 >=", value, "violation10");
            return (Criteria) this;
        }

        public Criteria andViolation10LessThan(Integer value) {
            addCriterion("violation_10 <", value, "violation10");
            return (Criteria) this;
        }

        public Criteria andViolation10LessThanOrEqualTo(Integer value) {
            addCriterion("violation_10 <=", value, "violation10");
            return (Criteria) this;
        }

        public Criteria andViolation10In(List<Integer> values) {
            addCriterion("violation_10 in", values, "violation10");
            return (Criteria) this;
        }

        public Criteria andViolation10NotIn(List<Integer> values) {
            addCriterion("violation_10 not in", values, "violation10");
            return (Criteria) this;
        }

        public Criteria andViolation10Between(Integer value1, Integer value2) {
            addCriterion("violation_10 between", value1, value2, "violation10");
            return (Criteria) this;
        }

        public Criteria andViolation10NotBetween(Integer value1, Integer value2) {
            addCriterion("violation_10 not between", value1, value2, "violation10");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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

        public Criteria andIntersectionIdIsNull() {
            addCriterion("intersection_id is null");
            return (Criteria) this;
        }

        public Criteria andIntersectionIdIsNotNull() {
            addCriterion("intersection_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntersectionIdEqualTo(Integer value) {
            addCriterion("intersection_id =", value, "intersectionId");
            return (Criteria) this;
        }

        public Criteria andIntersectionIdNotEqualTo(Integer value) {
            addCriterion("intersection_id <>", value, "intersectionId");
            return (Criteria) this;
        }

        public Criteria andIntersectionIdGreaterThan(Integer value) {
            addCriterion("intersection_id >", value, "intersectionId");
            return (Criteria) this;
        }

        public Criteria andIntersectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("intersection_id >=", value, "intersectionId");
            return (Criteria) this;
        }

        public Criteria andIntersectionIdLessThan(Integer value) {
            addCriterion("intersection_id <", value, "intersectionId");
            return (Criteria) this;
        }

        public Criteria andIntersectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("intersection_id <=", value, "intersectionId");
            return (Criteria) this;
        }

        public Criteria andIntersectionIdIn(List<Integer> values) {
            addCriterion("intersection_id in", values, "intersectionId");
            return (Criteria) this;
        }

        public Criteria andIntersectionIdNotIn(List<Integer> values) {
            addCriterion("intersection_id not in", values, "intersectionId");
            return (Criteria) this;
        }

        public Criteria andIntersectionIdBetween(Integer value1, Integer value2) {
            addCriterion("intersection_id between", value1, value2, "intersectionId");
            return (Criteria) this;
        }

        public Criteria andIntersectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("intersection_id not between", value1, value2, "intersectionId");
            return (Criteria) this;
        }

        public Criteria andTotal11IsNull() {
            addCriterion("total_11 is null");
            return (Criteria) this;
        }

        public Criteria andTotal11IsNotNull() {
            addCriterion("total_11 is not null");
            return (Criteria) this;
        }

        public Criteria andTotal11EqualTo(Integer value) {
            addCriterion("total_11 =", value, "total11");
            return (Criteria) this;
        }

        public Criteria andTotal11NotEqualTo(Integer value) {
            addCriterion("total_11 <>", value, "total11");
            return (Criteria) this;
        }

        public Criteria andTotal11GreaterThan(Integer value) {
            addCriterion("total_11 >", value, "total11");
            return (Criteria) this;
        }

        public Criteria andTotal11GreaterThanOrEqualTo(Integer value) {
            addCriterion("total_11 >=", value, "total11");
            return (Criteria) this;
        }

        public Criteria andTotal11LessThan(Integer value) {
            addCriterion("total_11 <", value, "total11");
            return (Criteria) this;
        }

        public Criteria andTotal11LessThanOrEqualTo(Integer value) {
            addCriterion("total_11 <=", value, "total11");
            return (Criteria) this;
        }

        public Criteria andTotal11In(List<Integer> values) {
            addCriterion("total_11 in", values, "total11");
            return (Criteria) this;
        }

        public Criteria andTotal11NotIn(List<Integer> values) {
            addCriterion("total_11 not in", values, "total11");
            return (Criteria) this;
        }

        public Criteria andTotal11Between(Integer value1, Integer value2) {
            addCriterion("total_11 between", value1, value2, "total11");
            return (Criteria) this;
        }

        public Criteria andTotal11NotBetween(Integer value1, Integer value2) {
            addCriterion("total_11 not between", value1, value2, "total11");
            return (Criteria) this;
        }

        public Criteria andTotal14IsNull() {
            addCriterion("total_14 is null");
            return (Criteria) this;
        }

        public Criteria andTotal14IsNotNull() {
            addCriterion("total_14 is not null");
            return (Criteria) this;
        }

        public Criteria andTotal14EqualTo(Integer value) {
            addCriterion("total_14 =", value, "total14");
            return (Criteria) this;
        }

        public Criteria andTotal14NotEqualTo(Integer value) {
            addCriterion("total_14 <>", value, "total14");
            return (Criteria) this;
        }

        public Criteria andTotal14GreaterThan(Integer value) {
            addCriterion("total_14 >", value, "total14");
            return (Criteria) this;
        }

        public Criteria andTotal14GreaterThanOrEqualTo(Integer value) {
            addCriterion("total_14 >=", value, "total14");
            return (Criteria) this;
        }

        public Criteria andTotal14LessThan(Integer value) {
            addCriterion("total_14 <", value, "total14");
            return (Criteria) this;
        }

        public Criteria andTotal14LessThanOrEqualTo(Integer value) {
            addCriterion("total_14 <=", value, "total14");
            return (Criteria) this;
        }

        public Criteria andTotal14In(List<Integer> values) {
            addCriterion("total_14 in", values, "total14");
            return (Criteria) this;
        }

        public Criteria andTotal14NotIn(List<Integer> values) {
            addCriterion("total_14 not in", values, "total14");
            return (Criteria) this;
        }

        public Criteria andTotal14Between(Integer value1, Integer value2) {
            addCriterion("total_14 between", value1, value2, "total14");
            return (Criteria) this;
        }

        public Criteria andTotal14NotBetween(Integer value1, Integer value2) {
            addCriterion("total_14 not between", value1, value2, "total14");
            return (Criteria) this;
        }

        public Criteria andTotal15IsNull() {
            addCriterion("total_15 is null");
            return (Criteria) this;
        }

        public Criteria andTotal15IsNotNull() {
            addCriterion("total_15 is not null");
            return (Criteria) this;
        }

        public Criteria andTotal15EqualTo(Integer value) {
            addCriterion("total_15 =", value, "total15");
            return (Criteria) this;
        }

        public Criteria andTotal15NotEqualTo(Integer value) {
            addCriterion("total_15 <>", value, "total15");
            return (Criteria) this;
        }

        public Criteria andTotal15GreaterThan(Integer value) {
            addCriterion("total_15 >", value, "total15");
            return (Criteria) this;
        }

        public Criteria andTotal15GreaterThanOrEqualTo(Integer value) {
            addCriterion("total_15 >=", value, "total15");
            return (Criteria) this;
        }

        public Criteria andTotal15LessThan(Integer value) {
            addCriterion("total_15 <", value, "total15");
            return (Criteria) this;
        }

        public Criteria andTotal15LessThanOrEqualTo(Integer value) {
            addCriterion("total_15 <=", value, "total15");
            return (Criteria) this;
        }

        public Criteria andTotal15In(List<Integer> values) {
            addCriterion("total_15 in", values, "total15");
            return (Criteria) this;
        }

        public Criteria andTotal15NotIn(List<Integer> values) {
            addCriterion("total_15 not in", values, "total15");
            return (Criteria) this;
        }

        public Criteria andTotal15Between(Integer value1, Integer value2) {
            addCriterion("total_15 between", value1, value2, "total15");
            return (Criteria) this;
        }

        public Criteria andTotal15NotBetween(Integer value1, Integer value2) {
            addCriterion("total_15 not between", value1, value2, "total15");
            return (Criteria) this;
        }

        public Criteria andTotal16IsNull() {
            addCriterion("total_16 is null");
            return (Criteria) this;
        }

        public Criteria andTotal16IsNotNull() {
            addCriterion("total_16 is not null");
            return (Criteria) this;
        }

        public Criteria andTotal16EqualTo(Integer value) {
            addCriterion("total_16 =", value, "total16");
            return (Criteria) this;
        }

        public Criteria andTotal16NotEqualTo(Integer value) {
            addCriterion("total_16 <>", value, "total16");
            return (Criteria) this;
        }

        public Criteria andTotal16GreaterThan(Integer value) {
            addCriterion("total_16 >", value, "total16");
            return (Criteria) this;
        }

        public Criteria andTotal16GreaterThanOrEqualTo(Integer value) {
            addCriterion("total_16 >=", value, "total16");
            return (Criteria) this;
        }

        public Criteria andTotal16LessThan(Integer value) {
            addCriterion("total_16 <", value, "total16");
            return (Criteria) this;
        }

        public Criteria andTotal16LessThanOrEqualTo(Integer value) {
            addCriterion("total_16 <=", value, "total16");
            return (Criteria) this;
        }

        public Criteria andTotal16In(List<Integer> values) {
            addCriterion("total_16 in", values, "total16");
            return (Criteria) this;
        }

        public Criteria andTotal16NotIn(List<Integer> values) {
            addCriterion("total_16 not in", values, "total16");
            return (Criteria) this;
        }

        public Criteria andTotal16Between(Integer value1, Integer value2) {
            addCriterion("total_16 between", value1, value2, "total16");
            return (Criteria) this;
        }

        public Criteria andTotal16NotBetween(Integer value1, Integer value2) {
            addCriterion("total_16 not between", value1, value2, "total16");
            return (Criteria) this;
        }

        public Criteria andTotal17IsNull() {
            addCriterion("total_17 is null");
            return (Criteria) this;
        }

        public Criteria andTotal17IsNotNull() {
            addCriterion("total_17 is not null");
            return (Criteria) this;
        }

        public Criteria andTotal17EqualTo(Integer value) {
            addCriterion("total_17 =", value, "total17");
            return (Criteria) this;
        }

        public Criteria andTotal17NotEqualTo(Integer value) {
            addCriterion("total_17 <>", value, "total17");
            return (Criteria) this;
        }

        public Criteria andTotal17GreaterThan(Integer value) {
            addCriterion("total_17 >", value, "total17");
            return (Criteria) this;
        }

        public Criteria andTotal17GreaterThanOrEqualTo(Integer value) {
            addCriterion("total_17 >=", value, "total17");
            return (Criteria) this;
        }

        public Criteria andTotal17LessThan(Integer value) {
            addCriterion("total_17 <", value, "total17");
            return (Criteria) this;
        }

        public Criteria andTotal17LessThanOrEqualTo(Integer value) {
            addCriterion("total_17 <=", value, "total17");
            return (Criteria) this;
        }

        public Criteria andTotal17In(List<Integer> values) {
            addCriterion("total_17 in", values, "total17");
            return (Criteria) this;
        }

        public Criteria andTotal17NotIn(List<Integer> values) {
            addCriterion("total_17 not in", values, "total17");
            return (Criteria) this;
        }

        public Criteria andTotal17Between(Integer value1, Integer value2) {
            addCriterion("total_17 between", value1, value2, "total17");
            return (Criteria) this;
        }

        public Criteria andTotal17NotBetween(Integer value1, Integer value2) {
            addCriterion("total_17 not between", value1, value2, "total17");
            return (Criteria) this;
        }

        public Criteria andTotal8IsNull() {
            addCriterion("total_8 is null");
            return (Criteria) this;
        }

        public Criteria andTotal8IsNotNull() {
            addCriterion("total_8 is not null");
            return (Criteria) this;
        }

        public Criteria andTotal8EqualTo(Integer value) {
            addCriterion("total_8 =", value, "total8");
            return (Criteria) this;
        }

        public Criteria andTotal8NotEqualTo(Integer value) {
            addCriterion("total_8 <>", value, "total8");
            return (Criteria) this;
        }

        public Criteria andTotal8GreaterThan(Integer value) {
            addCriterion("total_8 >", value, "total8");
            return (Criteria) this;
        }

        public Criteria andTotal8GreaterThanOrEqualTo(Integer value) {
            addCriterion("total_8 >=", value, "total8");
            return (Criteria) this;
        }

        public Criteria andTotal8LessThan(Integer value) {
            addCriterion("total_8 <", value, "total8");
            return (Criteria) this;
        }

        public Criteria andTotal8LessThanOrEqualTo(Integer value) {
            addCriterion("total_8 <=", value, "total8");
            return (Criteria) this;
        }

        public Criteria andTotal8In(List<Integer> values) {
            addCriterion("total_8 in", values, "total8");
            return (Criteria) this;
        }

        public Criteria andTotal8NotIn(List<Integer> values) {
            addCriterion("total_8 not in", values, "total8");
            return (Criteria) this;
        }

        public Criteria andTotal8Between(Integer value1, Integer value2) {
            addCriterion("total_8 between", value1, value2, "total8");
            return (Criteria) this;
        }

        public Criteria andTotal8NotBetween(Integer value1, Integer value2) {
            addCriterion("total_8 not between", value1, value2, "total8");
            return (Criteria) this;
        }

        public Criteria andTotal9IsNull() {
            addCriterion("total_9 is null");
            return (Criteria) this;
        }

        public Criteria andTotal9IsNotNull() {
            addCriterion("total_9 is not null");
            return (Criteria) this;
        }

        public Criteria andTotal9EqualTo(Integer value) {
            addCriterion("total_9 =", value, "total9");
            return (Criteria) this;
        }

        public Criteria andTotal9NotEqualTo(Integer value) {
            addCriterion("total_9 <>", value, "total9");
            return (Criteria) this;
        }

        public Criteria andTotal9GreaterThan(Integer value) {
            addCriterion("total_9 >", value, "total9");
            return (Criteria) this;
        }

        public Criteria andTotal9GreaterThanOrEqualTo(Integer value) {
            addCriterion("total_9 >=", value, "total9");
            return (Criteria) this;
        }

        public Criteria andTotal9LessThan(Integer value) {
            addCriterion("total_9 <", value, "total9");
            return (Criteria) this;
        }

        public Criteria andTotal9LessThanOrEqualTo(Integer value) {
            addCriterion("total_9 <=", value, "total9");
            return (Criteria) this;
        }

        public Criteria andTotal9In(List<Integer> values) {
            addCriterion("total_9 in", values, "total9");
            return (Criteria) this;
        }

        public Criteria andTotal9NotIn(List<Integer> values) {
            addCriterion("total_9 not in", values, "total9");
            return (Criteria) this;
        }

        public Criteria andTotal9Between(Integer value1, Integer value2) {
            addCriterion("total_9 between", value1, value2, "total9");
            return (Criteria) this;
        }

        public Criteria andTotal9NotBetween(Integer value1, Integer value2) {
            addCriterion("total_9 not between", value1, value2, "total9");
            return (Criteria) this;
        }

        public Criteria andViolation11IsNull() {
            addCriterion("violation_11 is null");
            return (Criteria) this;
        }

        public Criteria andViolation11IsNotNull() {
            addCriterion("violation_11 is not null");
            return (Criteria) this;
        }

        public Criteria andViolation11EqualTo(Integer value) {
            addCriterion("violation_11 =", value, "violation11");
            return (Criteria) this;
        }

        public Criteria andViolation11NotEqualTo(Integer value) {
            addCriterion("violation_11 <>", value, "violation11");
            return (Criteria) this;
        }

        public Criteria andViolation11GreaterThan(Integer value) {
            addCriterion("violation_11 >", value, "violation11");
            return (Criteria) this;
        }

        public Criteria andViolation11GreaterThanOrEqualTo(Integer value) {
            addCriterion("violation_11 >=", value, "violation11");
            return (Criteria) this;
        }

        public Criteria andViolation11LessThan(Integer value) {
            addCriterion("violation_11 <", value, "violation11");
            return (Criteria) this;
        }

        public Criteria andViolation11LessThanOrEqualTo(Integer value) {
            addCriterion("violation_11 <=", value, "violation11");
            return (Criteria) this;
        }

        public Criteria andViolation11In(List<Integer> values) {
            addCriterion("violation_11 in", values, "violation11");
            return (Criteria) this;
        }

        public Criteria andViolation11NotIn(List<Integer> values) {
            addCriterion("violation_11 not in", values, "violation11");
            return (Criteria) this;
        }

        public Criteria andViolation11Between(Integer value1, Integer value2) {
            addCriterion("violation_11 between", value1, value2, "violation11");
            return (Criteria) this;
        }

        public Criteria andViolation11NotBetween(Integer value1, Integer value2) {
            addCriterion("violation_11 not between", value1, value2, "violation11");
            return (Criteria) this;
        }

        public Criteria andViolation14IsNull() {
            addCriterion("violation_14 is null");
            return (Criteria) this;
        }

        public Criteria andViolation14IsNotNull() {
            addCriterion("violation_14 is not null");
            return (Criteria) this;
        }

        public Criteria andViolation14EqualTo(Integer value) {
            addCriterion("violation_14 =", value, "violation14");
            return (Criteria) this;
        }

        public Criteria andViolation14NotEqualTo(Integer value) {
            addCriterion("violation_14 <>", value, "violation14");
            return (Criteria) this;
        }

        public Criteria andViolation14GreaterThan(Integer value) {
            addCriterion("violation_14 >", value, "violation14");
            return (Criteria) this;
        }

        public Criteria andViolation14GreaterThanOrEqualTo(Integer value) {
            addCriterion("violation_14 >=", value, "violation14");
            return (Criteria) this;
        }

        public Criteria andViolation14LessThan(Integer value) {
            addCriterion("violation_14 <", value, "violation14");
            return (Criteria) this;
        }

        public Criteria andViolation14LessThanOrEqualTo(Integer value) {
            addCriterion("violation_14 <=", value, "violation14");
            return (Criteria) this;
        }

        public Criteria andViolation14In(List<Integer> values) {
            addCriterion("violation_14 in", values, "violation14");
            return (Criteria) this;
        }

        public Criteria andViolation14NotIn(List<Integer> values) {
            addCriterion("violation_14 not in", values, "violation14");
            return (Criteria) this;
        }

        public Criteria andViolation14Between(Integer value1, Integer value2) {
            addCriterion("violation_14 between", value1, value2, "violation14");
            return (Criteria) this;
        }

        public Criteria andViolation14NotBetween(Integer value1, Integer value2) {
            addCriterion("violation_14 not between", value1, value2, "violation14");
            return (Criteria) this;
        }

        public Criteria andViolation15IsNull() {
            addCriterion("violation_15 is null");
            return (Criteria) this;
        }

        public Criteria andViolation15IsNotNull() {
            addCriterion("violation_15 is not null");
            return (Criteria) this;
        }

        public Criteria andViolation15EqualTo(Integer value) {
            addCriterion("violation_15 =", value, "violation15");
            return (Criteria) this;
        }

        public Criteria andViolation15NotEqualTo(Integer value) {
            addCriterion("violation_15 <>", value, "violation15");
            return (Criteria) this;
        }

        public Criteria andViolation15GreaterThan(Integer value) {
            addCriterion("violation_15 >", value, "violation15");
            return (Criteria) this;
        }

        public Criteria andViolation15GreaterThanOrEqualTo(Integer value) {
            addCriterion("violation_15 >=", value, "violation15");
            return (Criteria) this;
        }

        public Criteria andViolation15LessThan(Integer value) {
            addCriterion("violation_15 <", value, "violation15");
            return (Criteria) this;
        }

        public Criteria andViolation15LessThanOrEqualTo(Integer value) {
            addCriterion("violation_15 <=", value, "violation15");
            return (Criteria) this;
        }

        public Criteria andViolation15In(List<Integer> values) {
            addCriterion("violation_15 in", values, "violation15");
            return (Criteria) this;
        }

        public Criteria andViolation15NotIn(List<Integer> values) {
            addCriterion("violation_15 not in", values, "violation15");
            return (Criteria) this;
        }

        public Criteria andViolation15Between(Integer value1, Integer value2) {
            addCriterion("violation_15 between", value1, value2, "violation15");
            return (Criteria) this;
        }

        public Criteria andViolation15NotBetween(Integer value1, Integer value2) {
            addCriterion("violation_15 not between", value1, value2, "violation15");
            return (Criteria) this;
        }

        public Criteria andViolation16IsNull() {
            addCriterion("violation_16 is null");
            return (Criteria) this;
        }

        public Criteria andViolation16IsNotNull() {
            addCriterion("violation_16 is not null");
            return (Criteria) this;
        }

        public Criteria andViolation16EqualTo(Integer value) {
            addCriterion("violation_16 =", value, "violation16");
            return (Criteria) this;
        }

        public Criteria andViolation16NotEqualTo(Integer value) {
            addCriterion("violation_16 <>", value, "violation16");
            return (Criteria) this;
        }

        public Criteria andViolation16GreaterThan(Integer value) {
            addCriterion("violation_16 >", value, "violation16");
            return (Criteria) this;
        }

        public Criteria andViolation16GreaterThanOrEqualTo(Integer value) {
            addCriterion("violation_16 >=", value, "violation16");
            return (Criteria) this;
        }

        public Criteria andViolation16LessThan(Integer value) {
            addCriterion("violation_16 <", value, "violation16");
            return (Criteria) this;
        }

        public Criteria andViolation16LessThanOrEqualTo(Integer value) {
            addCriterion("violation_16 <=", value, "violation16");
            return (Criteria) this;
        }

        public Criteria andViolation16In(List<Integer> values) {
            addCriterion("violation_16 in", values, "violation16");
            return (Criteria) this;
        }

        public Criteria andViolation16NotIn(List<Integer> values) {
            addCriterion("violation_16 not in", values, "violation16");
            return (Criteria) this;
        }

        public Criteria andViolation16Between(Integer value1, Integer value2) {
            addCriterion("violation_16 between", value1, value2, "violation16");
            return (Criteria) this;
        }

        public Criteria andViolation16NotBetween(Integer value1, Integer value2) {
            addCriterion("violation_16 not between", value1, value2, "violation16");
            return (Criteria) this;
        }

        public Criteria andViolation17IsNull() {
            addCriterion("violation_17 is null");
            return (Criteria) this;
        }

        public Criteria andViolation17IsNotNull() {
            addCriterion("violation_17 is not null");
            return (Criteria) this;
        }

        public Criteria andViolation17EqualTo(Integer value) {
            addCriterion("violation_17 =", value, "violation17");
            return (Criteria) this;
        }

        public Criteria andViolation17NotEqualTo(Integer value) {
            addCriterion("violation_17 <>", value, "violation17");
            return (Criteria) this;
        }

        public Criteria andViolation17GreaterThan(Integer value) {
            addCriterion("violation_17 >", value, "violation17");
            return (Criteria) this;
        }

        public Criteria andViolation17GreaterThanOrEqualTo(Integer value) {
            addCriterion("violation_17 >=", value, "violation17");
            return (Criteria) this;
        }

        public Criteria andViolation17LessThan(Integer value) {
            addCriterion("violation_17 <", value, "violation17");
            return (Criteria) this;
        }

        public Criteria andViolation17LessThanOrEqualTo(Integer value) {
            addCriterion("violation_17 <=", value, "violation17");
            return (Criteria) this;
        }

        public Criteria andViolation17In(List<Integer> values) {
            addCriterion("violation_17 in", values, "violation17");
            return (Criteria) this;
        }

        public Criteria andViolation17NotIn(List<Integer> values) {
            addCriterion("violation_17 not in", values, "violation17");
            return (Criteria) this;
        }

        public Criteria andViolation17Between(Integer value1, Integer value2) {
            addCriterion("violation_17 between", value1, value2, "violation17");
            return (Criteria) this;
        }

        public Criteria andViolation17NotBetween(Integer value1, Integer value2) {
            addCriterion("violation_17 not between", value1, value2, "violation17");
            return (Criteria) this;
        }

        public Criteria andViolation8IsNull() {
            addCriterion("violation_8 is null");
            return (Criteria) this;
        }

        public Criteria andViolation8IsNotNull() {
            addCriterion("violation_8 is not null");
            return (Criteria) this;
        }

        public Criteria andViolation8EqualTo(Integer value) {
            addCriterion("violation_8 =", value, "violation8");
            return (Criteria) this;
        }

        public Criteria andViolation8NotEqualTo(Integer value) {
            addCriterion("violation_8 <>", value, "violation8");
            return (Criteria) this;
        }

        public Criteria andViolation8GreaterThan(Integer value) {
            addCriterion("violation_8 >", value, "violation8");
            return (Criteria) this;
        }

        public Criteria andViolation8GreaterThanOrEqualTo(Integer value) {
            addCriterion("violation_8 >=", value, "violation8");
            return (Criteria) this;
        }

        public Criteria andViolation8LessThan(Integer value) {
            addCriterion("violation_8 <", value, "violation8");
            return (Criteria) this;
        }

        public Criteria andViolation8LessThanOrEqualTo(Integer value) {
            addCriterion("violation_8 <=", value, "violation8");
            return (Criteria) this;
        }

        public Criteria andViolation8In(List<Integer> values) {
            addCriterion("violation_8 in", values, "violation8");
            return (Criteria) this;
        }

        public Criteria andViolation8NotIn(List<Integer> values) {
            addCriterion("violation_8 not in", values, "violation8");
            return (Criteria) this;
        }

        public Criteria andViolation8Between(Integer value1, Integer value2) {
            addCriterion("violation_8 between", value1, value2, "violation8");
            return (Criteria) this;
        }

        public Criteria andViolation8NotBetween(Integer value1, Integer value2) {
            addCriterion("violation_8 not between", value1, value2, "violation8");
            return (Criteria) this;
        }

        public Criteria andViolation9IsNull() {
            addCriterion("violation_9 is null");
            return (Criteria) this;
        }

        public Criteria andViolation9IsNotNull() {
            addCriterion("violation_9 is not null");
            return (Criteria) this;
        }

        public Criteria andViolation9EqualTo(Integer value) {
            addCriterion("violation_9 =", value, "violation9");
            return (Criteria) this;
        }

        public Criteria andViolation9NotEqualTo(Integer value) {
            addCriterion("violation_9 <>", value, "violation9");
            return (Criteria) this;
        }

        public Criteria andViolation9GreaterThan(Integer value) {
            addCriterion("violation_9 >", value, "violation9");
            return (Criteria) this;
        }

        public Criteria andViolation9GreaterThanOrEqualTo(Integer value) {
            addCriterion("violation_9 >=", value, "violation9");
            return (Criteria) this;
        }

        public Criteria andViolation9LessThan(Integer value) {
            addCriterion("violation_9 <", value, "violation9");
            return (Criteria) this;
        }

        public Criteria andViolation9LessThanOrEqualTo(Integer value) {
            addCriterion("violation_9 <=", value, "violation9");
            return (Criteria) this;
        }

        public Criteria andViolation9In(List<Integer> values) {
            addCriterion("violation_9 in", values, "violation9");
            return (Criteria) this;
        }

        public Criteria andViolation9NotIn(List<Integer> values) {
            addCriterion("violation_9 not in", values, "violation9");
            return (Criteria) this;
        }

        public Criteria andViolation9Between(Integer value1, Integer value2) {
            addCriterion("violation_9 between", value1, value2, "violation9");
            return (Criteria) this;
        }

        public Criteria andViolation9NotBetween(Integer value1, Integer value2) {
            addCriterion("violation_9 not between", value1, value2, "violation9");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andViolationIsNull() {
            addCriterion("violation is null");
            return (Criteria) this;
        }

        public Criteria andViolationIsNotNull() {
            addCriterion("violation is not null");
            return (Criteria) this;
        }

        public Criteria andViolationEqualTo(Integer value) {
            addCriterion("violation =", value, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationNotEqualTo(Integer value) {
            addCriterion("violation <>", value, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationGreaterThan(Integer value) {
            addCriterion("violation >", value, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationGreaterThanOrEqualTo(Integer value) {
            addCriterion("violation >=", value, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationLessThan(Integer value) {
            addCriterion("violation <", value, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationLessThanOrEqualTo(Integer value) {
            addCriterion("violation <=", value, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationIn(List<Integer> values) {
            addCriterion("violation in", values, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationNotIn(List<Integer> values) {
            addCriterion("violation not in", values, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationBetween(Integer value1, Integer value2) {
            addCriterion("violation between", value1, value2, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationNotBetween(Integer value1, Integer value2) {
            addCriterion("violation not between", value1, value2, "violation");
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