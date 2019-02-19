package com.danchey.traffic.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParkExample() {
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

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCatabilityIsNull() {
            addCriterion("catability is null");
            return (Criteria) this;
        }

        public Criteria andCatabilityIsNotNull() {
            addCriterion("catability is not null");
            return (Criteria) this;
        }

        public Criteria andCatabilityEqualTo(Integer value) {
            addCriterion("catability =", value, "catability");
            return (Criteria) this;
        }

        public Criteria andCatabilityNotEqualTo(Integer value) {
            addCriterion("catability <>", value, "catability");
            return (Criteria) this;
        }

        public Criteria andCatabilityGreaterThan(Integer value) {
            addCriterion("catability >", value, "catability");
            return (Criteria) this;
        }

        public Criteria andCatabilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("catability >=", value, "catability");
            return (Criteria) this;
        }

        public Criteria andCatabilityLessThan(Integer value) {
            addCriterion("catability <", value, "catability");
            return (Criteria) this;
        }

        public Criteria andCatabilityLessThanOrEqualTo(Integer value) {
            addCriterion("catability <=", value, "catability");
            return (Criteria) this;
        }

        public Criteria andCatabilityIn(List<Integer> values) {
            addCriterion("catability in", values, "catability");
            return (Criteria) this;
        }

        public Criteria andCatabilityNotIn(List<Integer> values) {
            addCriterion("catability not in", values, "catability");
            return (Criteria) this;
        }

        public Criteria andCatabilityBetween(Integer value1, Integer value2) {
            addCriterion("catability between", value1, value2, "catability");
            return (Criteria) this;
        }

        public Criteria andCatabilityNotBetween(Integer value1, Integer value2) {
            addCriterion("catability not between", value1, value2, "catability");
            return (Criteria) this;
        }

        public Criteria andClassificationIsNull() {
            addCriterion("classification is null");
            return (Criteria) this;
        }

        public Criteria andClassificationIsNotNull() {
            addCriterion("classification is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationEqualTo(String value) {
            addCriterion("classification =", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotEqualTo(String value) {
            addCriterion("classification <>", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationGreaterThan(String value) {
            addCriterion("classification >", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("classification >=", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLessThan(String value) {
            addCriterion("classification <", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLessThanOrEqualTo(String value) {
            addCriterion("classification <=", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLike(String value) {
            addCriterion("classification like", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotLike(String value) {
            addCriterion("classification not like", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationIn(List<String> values) {
            addCriterion("classification in", values, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotIn(List<String> values) {
            addCriterion("classification not in", values, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationBetween(String value1, String value2) {
            addCriterion("classification between", value1, value2, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotBetween(String value1, String value2) {
            addCriterion("classification not between", value1, value2, "classification");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusIsNull() {
            addCriterion("businessStatus is null");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusIsNotNull() {
            addCriterion("businessStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusEqualTo(String value) {
            addCriterion("businessStatus =", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusNotEqualTo(String value) {
            addCriterion("businessStatus <>", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusGreaterThan(String value) {
            addCriterion("businessStatus >", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusGreaterThanOrEqualTo(String value) {
            addCriterion("businessStatus >=", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusLessThan(String value) {
            addCriterion("businessStatus <", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusLessThanOrEqualTo(String value) {
            addCriterion("businessStatus <=", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusLike(String value) {
            addCriterion("businessStatus like", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusNotLike(String value) {
            addCriterion("businessStatus not like", value, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusIn(List<String> values) {
            addCriterion("businessStatus in", values, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusNotIn(List<String> values) {
            addCriterion("businessStatus not in", values, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusBetween(String value1, String value2) {
            addCriterion("businessStatus between", value1, value2, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessstatusNotBetween(String value1, String value2) {
            addCriterion("businessStatus not between", value1, value2, "businessstatus");
            return (Criteria) this;
        }

        public Criteria andIssignIsNull() {
            addCriterion("isSign is null");
            return (Criteria) this;
        }

        public Criteria andIssignIsNotNull() {
            addCriterion("isSign is not null");
            return (Criteria) this;
        }

        public Criteria andIssignEqualTo(Boolean value) {
            addCriterion("isSign =", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotEqualTo(Boolean value) {
            addCriterion("isSign <>", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignGreaterThan(Boolean value) {
            addCriterion("isSign >", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isSign >=", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignLessThan(Boolean value) {
            addCriterion("isSign <", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignLessThanOrEqualTo(Boolean value) {
            addCriterion("isSign <=", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignIn(List<Boolean> values) {
            addCriterion("isSign in", values, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotIn(List<Boolean> values) {
            addCriterion("isSign not in", values, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignBetween(Boolean value1, Boolean value2) {
            addCriterion("isSign between", value1, value2, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isSign not between", value1, value2, "issign");
            return (Criteria) this;
        }

        public Criteria andParktypeIdIsNull() {
            addCriterion("parktype_id is null");
            return (Criteria) this;
        }

        public Criteria andParktypeIdIsNotNull() {
            addCriterion("parktype_id is not null");
            return (Criteria) this;
        }

        public Criteria andParktypeIdEqualTo(Integer value) {
            addCriterion("parktype_id =", value, "parktypeId");
            return (Criteria) this;
        }

        public Criteria andParktypeIdNotEqualTo(Integer value) {
            addCriterion("parktype_id <>", value, "parktypeId");
            return (Criteria) this;
        }

        public Criteria andParktypeIdGreaterThan(Integer value) {
            addCriterion("parktype_id >", value, "parktypeId");
            return (Criteria) this;
        }

        public Criteria andParktypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parktype_id >=", value, "parktypeId");
            return (Criteria) this;
        }

        public Criteria andParktypeIdLessThan(Integer value) {
            addCriterion("parktype_id <", value, "parktypeId");
            return (Criteria) this;
        }

        public Criteria andParktypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("parktype_id <=", value, "parktypeId");
            return (Criteria) this;
        }

        public Criteria andParktypeIdIn(List<Integer> values) {
            addCriterion("parktype_id in", values, "parktypeId");
            return (Criteria) this;
        }

        public Criteria andParktypeIdNotIn(List<Integer> values) {
            addCriterion("parktype_id not in", values, "parktypeId");
            return (Criteria) this;
        }

        public Criteria andParktypeIdBetween(Integer value1, Integer value2) {
            addCriterion("parktype_id between", value1, value2, "parktypeId");
            return (Criteria) this;
        }

        public Criteria andParktypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parktype_id not between", value1, value2, "parktypeId");
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