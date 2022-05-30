package com.atguigu.wechat.pojo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ResourcesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    public ResourcesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
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

        public Criteria andRhashIsNull() {
            addCriterion("rhash is null");
            return (Criteria) this;
        }

        public Criteria andRhashIsNotNull() {
            addCriterion("rhash is not null");
            return (Criteria) this;
        }

        public Criteria andRhashEqualTo(String value) {
            addCriterion("rhash =", value, "rhash");
            return (Criteria) this;
        }

        public Criteria andRhashNotEqualTo(String value) {
            addCriterion("rhash <>", value, "rhash");
            return (Criteria) this;
        }

        public Criteria andRhashGreaterThan(String value) {
            addCriterion("rhash >", value, "rhash");
            return (Criteria) this;
        }

        public Criteria andRhashGreaterThanOrEqualTo(String value) {
            addCriterion("rhash >=", value, "rhash");
            return (Criteria) this;
        }

        public Criteria andRhashLessThan(String value) {
            addCriterion("rhash <", value, "rhash");
            return (Criteria) this;
        }

        public Criteria andRhashLessThanOrEqualTo(String value) {
            addCriterion("rhash <=", value, "rhash");
            return (Criteria) this;
        }

        public Criteria andRhashLike(String value) {
            addCriterion("rhash like", value, "rhash");
            return (Criteria) this;
        }

        public Criteria andRhashNotLike(String value) {
            addCriterion("rhash not like", value, "rhash");
            return (Criteria) this;
        }

        public Criteria andRhashIn(List<String> values) {
            addCriterion("rhash in", values, "rhash");
            return (Criteria) this;
        }

        public Criteria andRhashNotIn(List<String> values) {
            addCriterion("rhash not in", values, "rhash");
            return (Criteria) this;
        }

        public Criteria andRhashBetween(String value1, String value2) {
            addCriterion("rhash between", value1, value2, "rhash");
            return (Criteria) this;
        }

        public Criteria andRhashNotBetween(String value1, String value2) {
            addCriterion("rhash not between", value1, value2, "rhash");
            return (Criteria) this;
        }

        public Criteria andRkeyIsNull() {
            addCriterion("rkey is null");
            return (Criteria) this;
        }

        public Criteria andRkeyIsNotNull() {
            addCriterion("rkey is not null");
            return (Criteria) this;
        }

        public Criteria andRkeyEqualTo(String value) {
            addCriterion("rkey =", value, "rkey");
            return (Criteria) this;
        }

        public Criteria andRkeyNotEqualTo(String value) {
            addCriterion("rkey <>", value, "rkey");
            return (Criteria) this;
        }

        public Criteria andRkeyGreaterThan(String value) {
            addCriterion("rkey >", value, "rkey");
            return (Criteria) this;
        }

        public Criteria andRkeyGreaterThanOrEqualTo(String value) {
            addCriterion("rkey >=", value, "rkey");
            return (Criteria) this;
        }

        public Criteria andRkeyLessThan(String value) {
            addCriterion("rkey <", value, "rkey");
            return (Criteria) this;
        }

        public Criteria andRkeyLessThanOrEqualTo(String value) {
            addCriterion("rkey <=", value, "rkey");
            return (Criteria) this;
        }

        public Criteria andRkeyLike(String value) {
            addCriterion("rkey like", value, "rkey");
            return (Criteria) this;
        }

        public Criteria andRkeyNotLike(String value) {
            addCriterion("rkey not like", value, "rkey");
            return (Criteria) this;
        }

        public Criteria andRkeyIn(List<String> values) {
            addCriterion("rkey in", values, "rkey");
            return (Criteria) this;
        }

        public Criteria andRkeyNotIn(List<String> values) {
            addCriterion("rkey not in", values, "rkey");
            return (Criteria) this;
        }

        public Criteria andRkeyBetween(String value1, String value2) {
            addCriterion("rkey between", value1, value2, "rkey");
            return (Criteria) this;
        }

        public Criteria andRkeyNotBetween(String value1, String value2) {
            addCriterion("rkey not between", value1, value2, "rkey");
            return (Criteria) this;
        }

        public Criteria andRtitleIsNull() {
            addCriterion("rtitle is null");
            return (Criteria) this;
        }

        public Criteria andRtitleIsNotNull() {
            addCriterion("rtitle is not null");
            return (Criteria) this;
        }

        public Criteria andRtitleEqualTo(String value) {
            addCriterion("rtitle =", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleNotEqualTo(String value) {
            addCriterion("rtitle <>", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleGreaterThan(String value) {
            addCriterion("rtitle >", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleGreaterThanOrEqualTo(String value) {
            addCriterion("rtitle >=", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleLessThan(String value) {
            addCriterion("rtitle <", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleLessThanOrEqualTo(String value) {
            addCriterion("rtitle <=", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleLike(String value) {
            addCriterion("rtitle like", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleNotLike(String value) {
            addCriterion("rtitle not like", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleIn(List<String> values) {
            addCriterion("rtitle in", values, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleNotIn(List<String> values) {
            addCriterion("rtitle not in", values, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleBetween(String value1, String value2) {
            addCriterion("rtitle between", value1, value2, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleNotBetween(String value1, String value2) {
            addCriterion("rtitle not between", value1, value2, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNull() {
            addCriterion("rtype is null");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNotNull() {
            addCriterion("rtype is not null");
            return (Criteria) this;
        }

        public Criteria andRtypeEqualTo(String value) {
            addCriterion("rtype =", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotEqualTo(String value) {
            addCriterion("rtype <>", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThan(String value) {
            addCriterion("rtype >", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThanOrEqualTo(String value) {
            addCriterion("rtype >=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThan(String value) {
            addCriterion("rtype <", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThanOrEqualTo(String value) {
            addCriterion("rtype <=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLike(String value) {
            addCriterion("rtype like", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotLike(String value) {
            addCriterion("rtype not like", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeIn(List<String> values) {
            addCriterion("rtype in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotIn(List<String> values) {
            addCriterion("rtype not in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeBetween(String value1, String value2) {
            addCriterion("rtype between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotBetween(String value1, String value2) {
            addCriterion("rtype not between", value1, value2, "rtype");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table resources
     *
     * @mbggenerated do_not_delete_during_merge Mon May 30 17:39:24 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table resources
     *
     * @mbggenerated Mon May 30 17:39:24 CST 2022
     */
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