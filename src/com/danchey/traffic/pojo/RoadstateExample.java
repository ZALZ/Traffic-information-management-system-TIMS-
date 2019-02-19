package com.danchey.traffic.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andRoadNameIsNull() {
            addCriterion("road_name is null");
            return (Criteria) this;
        }

        public Criteria andRoadNameIsNotNull() {
            addCriterion("road_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoadNameEqualTo(String value) {
            addCriterion("road_name =", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotEqualTo(String value) {
            addCriterion("road_name <>", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameGreaterThan(String value) {
            addCriterion("road_name >", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameGreaterThanOrEqualTo(String value) {
            addCriterion("road_name >=", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameLessThan(String value) {
            addCriterion("road_name <", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameLessThanOrEqualTo(String value) {
            addCriterion("road_name <=", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameLike(String value) {
            addCriterion("road_name like", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotLike(String value) {
            addCriterion("road_name not like", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameIn(List<String> values) {
            addCriterion("road_name in", values, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotIn(List<String> values) {
            addCriterion("road_name not in", values, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameBetween(String value1, String value2) {
            addCriterion("road_name between", value1, value2, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotBetween(String value1, String value2) {
            addCriterion("road_name not between", value1, value2, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadTypeIsNull() {
            addCriterion("road_type is null");
            return (Criteria) this;
        }

        public Criteria andRoadTypeIsNotNull() {
            addCriterion("road_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoadTypeEqualTo(String value) {
            addCriterion("road_type =", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeNotEqualTo(String value) {
            addCriterion("road_type <>", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeGreaterThan(String value) {
            addCriterion("road_type >", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeGreaterThanOrEqualTo(String value) {
            addCriterion("road_type >=", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeLessThan(String value) {
            addCriterion("road_type <", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeLessThanOrEqualTo(String value) {
            addCriterion("road_type <=", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeLike(String value) {
            addCriterion("road_type like", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeNotLike(String value) {
            addCriterion("road_type not like", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeIn(List<String> values) {
            addCriterion("road_type in", values, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeNotIn(List<String> values) {
            addCriterion("road_type not in", values, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeBetween(String value1, String value2) {
            addCriterion("road_type between", value1, value2, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeNotBetween(String value1, String value2) {
            addCriterion("road_type not between", value1, value2, "roadType");
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

        public Criteria andSectionFormIsNull() {
            addCriterion("section_form is null");
            return (Criteria) this;
        }

        public Criteria andSectionFormIsNotNull() {
            addCriterion("section_form is not null");
            return (Criteria) this;
        }

        public Criteria andSectionFormEqualTo(String value) {
            addCriterion("section_form =", value, "sectionForm");
            return (Criteria) this;
        }

        public Criteria andSectionFormNotEqualTo(String value) {
            addCriterion("section_form <>", value, "sectionForm");
            return (Criteria) this;
        }

        public Criteria andSectionFormGreaterThan(String value) {
            addCriterion("section_form >", value, "sectionForm");
            return (Criteria) this;
        }

        public Criteria andSectionFormGreaterThanOrEqualTo(String value) {
            addCriterion("section_form >=", value, "sectionForm");
            return (Criteria) this;
        }

        public Criteria andSectionFormLessThan(String value) {
            addCriterion("section_form <", value, "sectionForm");
            return (Criteria) this;
        }

        public Criteria andSectionFormLessThanOrEqualTo(String value) {
            addCriterion("section_form <=", value, "sectionForm");
            return (Criteria) this;
        }

        public Criteria andSectionFormLike(String value) {
            addCriterion("section_form like", value, "sectionForm");
            return (Criteria) this;
        }

        public Criteria andSectionFormNotLike(String value) {
            addCriterion("section_form not like", value, "sectionForm");
            return (Criteria) this;
        }

        public Criteria andSectionFormIn(List<String> values) {
            addCriterion("section_form in", values, "sectionForm");
            return (Criteria) this;
        }

        public Criteria andSectionFormNotIn(List<String> values) {
            addCriterion("section_form not in", values, "sectionForm");
            return (Criteria) this;
        }

        public Criteria andSectionFormBetween(String value1, String value2) {
            addCriterion("section_form between", value1, value2, "sectionForm");
            return (Criteria) this;
        }

        public Criteria andSectionFormNotBetween(String value1, String value2) {
            addCriterion("section_form not between", value1, value2, "sectionForm");
            return (Criteria) this;
        }

        public Criteria andMotorwayWidthIsNull() {
            addCriterion("motorway_width is null");
            return (Criteria) this;
        }

        public Criteria andMotorwayWidthIsNotNull() {
            addCriterion("motorway_width is not null");
            return (Criteria) this;
        }

        public Criteria andMotorwayWidthEqualTo(BigDecimal value) {
            addCriterion("motorway_width =", value, "motorwayWidth");
            return (Criteria) this;
        }

        public Criteria andMotorwayWidthNotEqualTo(BigDecimal value) {
            addCriterion("motorway_width <>", value, "motorwayWidth");
            return (Criteria) this;
        }

        public Criteria andMotorwayWidthGreaterThan(BigDecimal value) {
            addCriterion("motorway_width >", value, "motorwayWidth");
            return (Criteria) this;
        }

        public Criteria andMotorwayWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("motorway_width >=", value, "motorwayWidth");
            return (Criteria) this;
        }

        public Criteria andMotorwayWidthLessThan(BigDecimal value) {
            addCriterion("motorway_width <", value, "motorwayWidth");
            return (Criteria) this;
        }

        public Criteria andMotorwayWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("motorway_width <=", value, "motorwayWidth");
            return (Criteria) this;
        }

        public Criteria andMotorwayWidthIn(List<BigDecimal> values) {
            addCriterion("motorway_width in", values, "motorwayWidth");
            return (Criteria) this;
        }

        public Criteria andMotorwayWidthNotIn(List<BigDecimal> values) {
            addCriterion("motorway_width not in", values, "motorwayWidth");
            return (Criteria) this;
        }

        public Criteria andMotorwayWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("motorway_width between", value1, value2, "motorwayWidth");
            return (Criteria) this;
        }

        public Criteria andMotorwayWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("motorway_width not between", value1, value2, "motorwayWidth");
            return (Criteria) this;
        }

        public Criteria andSuperWayWidthIsNull() {
            addCriterion("super_way_width is null");
            return (Criteria) this;
        }

        public Criteria andSuperWayWidthIsNotNull() {
            addCriterion("super_way_width is not null");
            return (Criteria) this;
        }

        public Criteria andSuperWayWidthEqualTo(BigDecimal value) {
            addCriterion("super_way_width =", value, "superWayWidth");
            return (Criteria) this;
        }

        public Criteria andSuperWayWidthNotEqualTo(BigDecimal value) {
            addCriterion("super_way_width <>", value, "superWayWidth");
            return (Criteria) this;
        }

        public Criteria andSuperWayWidthGreaterThan(BigDecimal value) {
            addCriterion("super_way_width >", value, "superWayWidth");
            return (Criteria) this;
        }

        public Criteria andSuperWayWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("super_way_width >=", value, "superWayWidth");
            return (Criteria) this;
        }

        public Criteria andSuperWayWidthLessThan(BigDecimal value) {
            addCriterion("super_way_width <", value, "superWayWidth");
            return (Criteria) this;
        }

        public Criteria andSuperWayWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("super_way_width <=", value, "superWayWidth");
            return (Criteria) this;
        }

        public Criteria andSuperWayWidthIn(List<BigDecimal> values) {
            addCriterion("super_way_width in", values, "superWayWidth");
            return (Criteria) this;
        }

        public Criteria andSuperWayWidthNotIn(List<BigDecimal> values) {
            addCriterion("super_way_width not in", values, "superWayWidth");
            return (Criteria) this;
        }

        public Criteria andSuperWayWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("super_way_width between", value1, value2, "superWayWidth");
            return (Criteria) this;
        }

        public Criteria andSuperWayWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("super_way_width not between", value1, value2, "superWayWidth");
            return (Criteria) this;
        }

        public Criteria andPavementWidthIsNull() {
            addCriterion("pavement_width is null");
            return (Criteria) this;
        }

        public Criteria andPavementWidthIsNotNull() {
            addCriterion("pavement_width is not null");
            return (Criteria) this;
        }

        public Criteria andPavementWidthEqualTo(BigDecimal value) {
            addCriterion("pavement_width =", value, "pavementWidth");
            return (Criteria) this;
        }

        public Criteria andPavementWidthNotEqualTo(BigDecimal value) {
            addCriterion("pavement_width <>", value, "pavementWidth");
            return (Criteria) this;
        }

        public Criteria andPavementWidthGreaterThan(BigDecimal value) {
            addCriterion("pavement_width >", value, "pavementWidth");
            return (Criteria) this;
        }

        public Criteria andPavementWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pavement_width >=", value, "pavementWidth");
            return (Criteria) this;
        }

        public Criteria andPavementWidthLessThan(BigDecimal value) {
            addCriterion("pavement_width <", value, "pavementWidth");
            return (Criteria) this;
        }

        public Criteria andPavementWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pavement_width <=", value, "pavementWidth");
            return (Criteria) this;
        }

        public Criteria andPavementWidthIn(List<BigDecimal> values) {
            addCriterion("pavement_width in", values, "pavementWidth");
            return (Criteria) this;
        }

        public Criteria andPavementWidthNotIn(List<BigDecimal> values) {
            addCriterion("pavement_width not in", values, "pavementWidth");
            return (Criteria) this;
        }

        public Criteria andPavementWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pavement_width between", value1, value2, "pavementWidth");
            return (Criteria) this;
        }

        public Criteria andPavementWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pavement_width not between", value1, value2, "pavementWidth");
            return (Criteria) this;
        }

        public Criteria andMedianWidthIsNull() {
            addCriterion("median_width is null");
            return (Criteria) this;
        }

        public Criteria andMedianWidthIsNotNull() {
            addCriterion("median_width is not null");
            return (Criteria) this;
        }

        public Criteria andMedianWidthEqualTo(BigDecimal value) {
            addCriterion("median_width =", value, "medianWidth");
            return (Criteria) this;
        }

        public Criteria andMedianWidthNotEqualTo(BigDecimal value) {
            addCriterion("median_width <>", value, "medianWidth");
            return (Criteria) this;
        }

        public Criteria andMedianWidthGreaterThan(BigDecimal value) {
            addCriterion("median_width >", value, "medianWidth");
            return (Criteria) this;
        }

        public Criteria andMedianWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("median_width >=", value, "medianWidth");
            return (Criteria) this;
        }

        public Criteria andMedianWidthLessThan(BigDecimal value) {
            addCriterion("median_width <", value, "medianWidth");
            return (Criteria) this;
        }

        public Criteria andMedianWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("median_width <=", value, "medianWidth");
            return (Criteria) this;
        }

        public Criteria andMedianWidthIn(List<BigDecimal> values) {
            addCriterion("median_width in", values, "medianWidth");
            return (Criteria) this;
        }

        public Criteria andMedianWidthNotIn(List<BigDecimal> values) {
            addCriterion("median_width not in", values, "medianWidth");
            return (Criteria) this;
        }

        public Criteria andMedianWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("median_width between", value1, value2, "medianWidth");
            return (Criteria) this;
        }

        public Criteria andMedianWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("median_width not between", value1, value2, "medianWidth");
            return (Criteria) this;
        }

        public Criteria andSidesSeparateBeltWidthIsNull() {
            addCriterion("sides_separate_belt_width is null");
            return (Criteria) this;
        }

        public Criteria andSidesSeparateBeltWidthIsNotNull() {
            addCriterion("sides_separate_belt_width is not null");
            return (Criteria) this;
        }

        public Criteria andSidesSeparateBeltWidthEqualTo(BigDecimal value) {
            addCriterion("sides_separate_belt_width =", value, "sidesSeparateBeltWidth");
            return (Criteria) this;
        }

        public Criteria andSidesSeparateBeltWidthNotEqualTo(BigDecimal value) {
            addCriterion("sides_separate_belt_width <>", value, "sidesSeparateBeltWidth");
            return (Criteria) this;
        }

        public Criteria andSidesSeparateBeltWidthGreaterThan(BigDecimal value) {
            addCriterion("sides_separate_belt_width >", value, "sidesSeparateBeltWidth");
            return (Criteria) this;
        }

        public Criteria andSidesSeparateBeltWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sides_separate_belt_width >=", value, "sidesSeparateBeltWidth");
            return (Criteria) this;
        }

        public Criteria andSidesSeparateBeltWidthLessThan(BigDecimal value) {
            addCriterion("sides_separate_belt_width <", value, "sidesSeparateBeltWidth");
            return (Criteria) this;
        }

        public Criteria andSidesSeparateBeltWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sides_separate_belt_width <=", value, "sidesSeparateBeltWidth");
            return (Criteria) this;
        }

        public Criteria andSidesSeparateBeltWidthIn(List<BigDecimal> values) {
            addCriterion("sides_separate_belt_width in", values, "sidesSeparateBeltWidth");
            return (Criteria) this;
        }

        public Criteria andSidesSeparateBeltWidthNotIn(List<BigDecimal> values) {
            addCriterion("sides_separate_belt_width not in", values, "sidesSeparateBeltWidth");
            return (Criteria) this;
        }

        public Criteria andSidesSeparateBeltWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sides_separate_belt_width between", value1, value2, "sidesSeparateBeltWidth");
            return (Criteria) this;
        }

        public Criteria andSidesSeparateBeltWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sides_separate_belt_width not between", value1, value2, "sidesSeparateBeltWidth");
            return (Criteria) this;
        }

        public Criteria andRedLineWidthIsNull() {
            addCriterion("red_line_width is null");
            return (Criteria) this;
        }

        public Criteria andRedLineWidthIsNotNull() {
            addCriterion("red_line_width is not null");
            return (Criteria) this;
        }

        public Criteria andRedLineWidthEqualTo(BigDecimal value) {
            addCriterion("red_line_width =", value, "redLineWidth");
            return (Criteria) this;
        }

        public Criteria andRedLineWidthNotEqualTo(BigDecimal value) {
            addCriterion("red_line_width <>", value, "redLineWidth");
            return (Criteria) this;
        }

        public Criteria andRedLineWidthGreaterThan(BigDecimal value) {
            addCriterion("red_line_width >", value, "redLineWidth");
            return (Criteria) this;
        }

        public Criteria andRedLineWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("red_line_width >=", value, "redLineWidth");
            return (Criteria) this;
        }

        public Criteria andRedLineWidthLessThan(BigDecimal value) {
            addCriterion("red_line_width <", value, "redLineWidth");
            return (Criteria) this;
        }

        public Criteria andRedLineWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("red_line_width <=", value, "redLineWidth");
            return (Criteria) this;
        }

        public Criteria andRedLineWidthIn(List<BigDecimal> values) {
            addCriterion("red_line_width in", values, "redLineWidth");
            return (Criteria) this;
        }

        public Criteria andRedLineWidthNotIn(List<BigDecimal> values) {
            addCriterion("red_line_width not in", values, "redLineWidth");
            return (Criteria) this;
        }

        public Criteria andRedLineWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("red_line_width between", value1, value2, "redLineWidth");
            return (Criteria) this;
        }

        public Criteria andRedLineWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("red_line_width not between", value1, value2, "redLineWidth");
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

        public Criteria andRoadbedTypeIdIsNull() {
            addCriterion("roadbed_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRoadbedTypeIdIsNotNull() {
            addCriterion("roadbed_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoadbedTypeIdEqualTo(Integer value) {
            addCriterion("roadbed_type_id =", value, "roadbedTypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedTypeIdNotEqualTo(Integer value) {
            addCriterion("roadbed_type_id <>", value, "roadbedTypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedTypeIdGreaterThan(Integer value) {
            addCriterion("roadbed_type_id >", value, "roadbedTypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roadbed_type_id >=", value, "roadbedTypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedTypeIdLessThan(Integer value) {
            addCriterion("roadbed_type_id <", value, "roadbedTypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("roadbed_type_id <=", value, "roadbedTypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedTypeIdIn(List<Integer> values) {
            addCriterion("roadbed_type_id in", values, "roadbedTypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedTypeIdNotIn(List<Integer> values) {
            addCriterion("roadbed_type_id not in", values, "roadbedTypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("roadbed_type_id between", value1, value2, "roadbedTypeId");
            return (Criteria) this;
        }

        public Criteria andRoadbedTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roadbed_type_id not between", value1, value2, "roadbedTypeId");
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