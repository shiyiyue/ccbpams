package pams.repository.model;

import java.util.ArrayList;
import java.util.List;

public class PterrorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    public PterrorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
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
     * This method corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
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

        public Criteria andMoudleidIsNull() {
            addCriterion("MOUDLEID is null");
            return (Criteria) this;
        }

        public Criteria andMoudleidIsNotNull() {
            addCriterion("MOUDLEID is not null");
            return (Criteria) this;
        }

        public Criteria andMoudleidEqualTo(String value) {
            addCriterion("MOUDLEID =", value, "moudleid");
            return (Criteria) this;
        }

        public Criteria andMoudleidNotEqualTo(String value) {
            addCriterion("MOUDLEID <>", value, "moudleid");
            return (Criteria) this;
        }

        public Criteria andMoudleidGreaterThan(String value) {
            addCriterion("MOUDLEID >", value, "moudleid");
            return (Criteria) this;
        }

        public Criteria andMoudleidGreaterThanOrEqualTo(String value) {
            addCriterion("MOUDLEID >=", value, "moudleid");
            return (Criteria) this;
        }

        public Criteria andMoudleidLessThan(String value) {
            addCriterion("MOUDLEID <", value, "moudleid");
            return (Criteria) this;
        }

        public Criteria andMoudleidLessThanOrEqualTo(String value) {
            addCriterion("MOUDLEID <=", value, "moudleid");
            return (Criteria) this;
        }

        public Criteria andMoudleidLike(String value) {
            addCriterion("MOUDLEID like", value, "moudleid");
            return (Criteria) this;
        }

        public Criteria andMoudleidNotLike(String value) {
            addCriterion("MOUDLEID not like", value, "moudleid");
            return (Criteria) this;
        }

        public Criteria andMoudleidIn(List<String> values) {
            addCriterion("MOUDLEID in", values, "moudleid");
            return (Criteria) this;
        }

        public Criteria andMoudleidNotIn(List<String> values) {
            addCriterion("MOUDLEID not in", values, "moudleid");
            return (Criteria) this;
        }

        public Criteria andMoudleidBetween(String value1, String value2) {
            addCriterion("MOUDLEID between", value1, value2, "moudleid");
            return (Criteria) this;
        }

        public Criteria andMoudleidNotBetween(String value1, String value2) {
            addCriterion("MOUDLEID not between", value1, value2, "moudleid");
            return (Criteria) this;
        }

        public Criteria andErrortypeIsNull() {
            addCriterion("ERRORTYPE is null");
            return (Criteria) this;
        }

        public Criteria andErrortypeIsNotNull() {
            addCriterion("ERRORTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andErrortypeEqualTo(String value) {
            addCriterion("ERRORTYPE =", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeNotEqualTo(String value) {
            addCriterion("ERRORTYPE <>", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeGreaterThan(String value) {
            addCriterion("ERRORTYPE >", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORTYPE >=", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeLessThan(String value) {
            addCriterion("ERRORTYPE <", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeLessThanOrEqualTo(String value) {
            addCriterion("ERRORTYPE <=", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeLike(String value) {
            addCriterion("ERRORTYPE like", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeNotLike(String value) {
            addCriterion("ERRORTYPE not like", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeIn(List<String> values) {
            addCriterion("ERRORTYPE in", values, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeNotIn(List<String> values) {
            addCriterion("ERRORTYPE not in", values, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeBetween(String value1, String value2) {
            addCriterion("ERRORTYPE between", value1, value2, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeNotBetween(String value1, String value2) {
            addCriterion("ERRORTYPE not between", value1, value2, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrorindexIsNull() {
            addCriterion("ERRORINDEX is null");
            return (Criteria) this;
        }

        public Criteria andErrorindexIsNotNull() {
            addCriterion("ERRORINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andErrorindexEqualTo(String value) {
            addCriterion("ERRORINDEX =", value, "errorindex");
            return (Criteria) this;
        }

        public Criteria andErrorindexNotEqualTo(String value) {
            addCriterion("ERRORINDEX <>", value, "errorindex");
            return (Criteria) this;
        }

        public Criteria andErrorindexGreaterThan(String value) {
            addCriterion("ERRORINDEX >", value, "errorindex");
            return (Criteria) this;
        }

        public Criteria andErrorindexGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORINDEX >=", value, "errorindex");
            return (Criteria) this;
        }

        public Criteria andErrorindexLessThan(String value) {
            addCriterion("ERRORINDEX <", value, "errorindex");
            return (Criteria) this;
        }

        public Criteria andErrorindexLessThanOrEqualTo(String value) {
            addCriterion("ERRORINDEX <=", value, "errorindex");
            return (Criteria) this;
        }

        public Criteria andErrorindexLike(String value) {
            addCriterion("ERRORINDEX like", value, "errorindex");
            return (Criteria) this;
        }

        public Criteria andErrorindexNotLike(String value) {
            addCriterion("ERRORINDEX not like", value, "errorindex");
            return (Criteria) this;
        }

        public Criteria andErrorindexIn(List<String> values) {
            addCriterion("ERRORINDEX in", values, "errorindex");
            return (Criteria) this;
        }

        public Criteria andErrorindexNotIn(List<String> values) {
            addCriterion("ERRORINDEX not in", values, "errorindex");
            return (Criteria) this;
        }

        public Criteria andErrorindexBetween(String value1, String value2) {
            addCriterion("ERRORINDEX between", value1, value2, "errorindex");
            return (Criteria) this;
        }

        public Criteria andErrorindexNotBetween(String value1, String value2) {
            addCriterion("ERRORINDEX not between", value1, value2, "errorindex");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("MESSAGE =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("MESSAGE <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("MESSAGE >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("MESSAGE <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("MESSAGE like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("MESSAGE not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("MESSAGE in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("MESSAGE not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("MESSAGE between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("MESSAGE not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andFill1IsNull() {
            addCriterion("FILL1 is null");
            return (Criteria) this;
        }

        public Criteria andFill1IsNotNull() {
            addCriterion("FILL1 is not null");
            return (Criteria) this;
        }

        public Criteria andFill1EqualTo(String value) {
            addCriterion("FILL1 =", value, "fill1");
            return (Criteria) this;
        }

        public Criteria andFill1NotEqualTo(String value) {
            addCriterion("FILL1 <>", value, "fill1");
            return (Criteria) this;
        }

        public Criteria andFill1GreaterThan(String value) {
            addCriterion("FILL1 >", value, "fill1");
            return (Criteria) this;
        }

        public Criteria andFill1GreaterThanOrEqualTo(String value) {
            addCriterion("FILL1 >=", value, "fill1");
            return (Criteria) this;
        }

        public Criteria andFill1LessThan(String value) {
            addCriterion("FILL1 <", value, "fill1");
            return (Criteria) this;
        }

        public Criteria andFill1LessThanOrEqualTo(String value) {
            addCriterion("FILL1 <=", value, "fill1");
            return (Criteria) this;
        }

        public Criteria andFill1Like(String value) {
            addCriterion("FILL1 like", value, "fill1");
            return (Criteria) this;
        }

        public Criteria andFill1NotLike(String value) {
            addCriterion("FILL1 not like", value, "fill1");
            return (Criteria) this;
        }

        public Criteria andFill1In(List<String> values) {
            addCriterion("FILL1 in", values, "fill1");
            return (Criteria) this;
        }

        public Criteria andFill1NotIn(List<String> values) {
            addCriterion("FILL1 not in", values, "fill1");
            return (Criteria) this;
        }

        public Criteria andFill1Between(String value1, String value2) {
            addCriterion("FILL1 between", value1, value2, "fill1");
            return (Criteria) this;
        }

        public Criteria andFill1NotBetween(String value1, String value2) {
            addCriterion("FILL1 not between", value1, value2, "fill1");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PTERROR
     *
     * @mbggenerated do_not_delete_during_merge Sat Mar 19 22:33:44 CST 2011
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PTERROR
     *
     * @mbggenerated Sat Mar 19 22:33:44 CST 2011
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