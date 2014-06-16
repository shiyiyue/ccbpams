package pams.repository.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysBbsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    public SysBbsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
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
     * This method corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
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

        public Criteria andGuidIsNull() {
            addCriterion("GUID is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("GUID is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("GUID =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("GUID <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("GUID >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("GUID >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("GUID <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("GUID <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("GUID like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("GUID not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("GUID in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("GUID not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("GUID between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("GUID not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNull() {
            addCriterion("NEWSID is null");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNotNull() {
            addCriterion("NEWSID is not null");
            return (Criteria) this;
        }

        public Criteria andNewsidEqualTo(String value) {
            addCriterion("NEWSID =", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotEqualTo(String value) {
            addCriterion("NEWSID <>", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThan(String value) {
            addCriterion("NEWSID >", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThanOrEqualTo(String value) {
            addCriterion("NEWSID >=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThan(String value) {
            addCriterion("NEWSID <", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThanOrEqualTo(String value) {
            addCriterion("NEWSID <=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLike(String value) {
            addCriterion("NEWSID like", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotLike(String value) {
            addCriterion("NEWSID not like", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidIn(List<String> values) {
            addCriterion("NEWSID in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotIn(List<String> values) {
            addCriterion("NEWSID not in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidBetween(String value1, String value2) {
            addCriterion("NEWSID between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotBetween(String value1, String value2) {
            addCriterion("NEWSID not between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNull() {
            addCriterion("NEWSTITLE is null");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNotNull() {
            addCriterion("NEWSTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andNewstitleEqualTo(String value) {
            addCriterion("NEWSTITLE =", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotEqualTo(String value) {
            addCriterion("NEWSTITLE <>", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThan(String value) {
            addCriterion("NEWSTITLE >", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThanOrEqualTo(String value) {
            addCriterion("NEWSTITLE >=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThan(String value) {
            addCriterion("NEWSTITLE <", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThanOrEqualTo(String value) {
            addCriterion("NEWSTITLE <=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLike(String value) {
            addCriterion("NEWSTITLE like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotLike(String value) {
            addCriterion("NEWSTITLE not like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleIn(List<String> values) {
            addCriterion("NEWSTITLE in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotIn(List<String> values) {
            addCriterion("NEWSTITLE not in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleBetween(String value1, String value2) {
            addCriterion("NEWSTITLE between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotBetween(String value1, String value2) {
            addCriterion("NEWSTITLE not between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewssummaryIsNull() {
            addCriterion("NEWSSUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andNewssummaryIsNotNull() {
            addCriterion("NEWSSUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andNewssummaryEqualTo(String value) {
            addCriterion("NEWSSUMMARY =", value, "newssummary");
            return (Criteria) this;
        }

        public Criteria andNewssummaryNotEqualTo(String value) {
            addCriterion("NEWSSUMMARY <>", value, "newssummary");
            return (Criteria) this;
        }

        public Criteria andNewssummaryGreaterThan(String value) {
            addCriterion("NEWSSUMMARY >", value, "newssummary");
            return (Criteria) this;
        }

        public Criteria andNewssummaryGreaterThanOrEqualTo(String value) {
            addCriterion("NEWSSUMMARY >=", value, "newssummary");
            return (Criteria) this;
        }

        public Criteria andNewssummaryLessThan(String value) {
            addCriterion("NEWSSUMMARY <", value, "newssummary");
            return (Criteria) this;
        }

        public Criteria andNewssummaryLessThanOrEqualTo(String value) {
            addCriterion("NEWSSUMMARY <=", value, "newssummary");
            return (Criteria) this;
        }

        public Criteria andNewssummaryLike(String value) {
            addCriterion("NEWSSUMMARY like", value, "newssummary");
            return (Criteria) this;
        }

        public Criteria andNewssummaryNotLike(String value) {
            addCriterion("NEWSSUMMARY not like", value, "newssummary");
            return (Criteria) this;
        }

        public Criteria andNewssummaryIn(List<String> values) {
            addCriterion("NEWSSUMMARY in", values, "newssummary");
            return (Criteria) this;
        }

        public Criteria andNewssummaryNotIn(List<String> values) {
            addCriterion("NEWSSUMMARY not in", values, "newssummary");
            return (Criteria) this;
        }

        public Criteria andNewssummaryBetween(String value1, String value2) {
            addCriterion("NEWSSUMMARY between", value1, value2, "newssummary");
            return (Criteria) this;
        }

        public Criteria andNewssummaryNotBetween(String value1, String value2) {
            addCriterion("NEWSSUMMARY not between", value1, value2, "newssummary");
            return (Criteria) this;
        }

        public Criteria andNewscontentIsNull() {
            addCriterion("NEWSCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andNewscontentIsNotNull() {
            addCriterion("NEWSCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andNewscontentEqualTo(String value) {
            addCriterion("NEWSCONTENT =", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotEqualTo(String value) {
            addCriterion("NEWSCONTENT <>", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentGreaterThan(String value) {
            addCriterion("NEWSCONTENT >", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentGreaterThanOrEqualTo(String value) {
            addCriterion("NEWSCONTENT >=", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentLessThan(String value) {
            addCriterion("NEWSCONTENT <", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentLessThanOrEqualTo(String value) {
            addCriterion("NEWSCONTENT <=", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentLike(String value) {
            addCriterion("NEWSCONTENT like", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotLike(String value) {
            addCriterion("NEWSCONTENT not like", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentIn(List<String> values) {
            addCriterion("NEWSCONTENT in", values, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotIn(List<String> values) {
            addCriterion("NEWSCONTENT not in", values, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentBetween(String value1, String value2) {
            addCriterion("NEWSCONTENT between", value1, value2, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotBetween(String value1, String value2) {
            addCriterion("NEWSCONTENT not between", value1, value2, "newscontent");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("STARTDATE like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("STARTDATE not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
            addCriterion("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("STARTTIME =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("STARTTIME <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("STARTTIME >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("STARTTIME >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("STARTTIME <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("STARTTIME <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("STARTTIME like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("STARTTIME not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("STARTTIME in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("STARTTIME not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("STARTTIME between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("STARTTIME not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOperidIsNull() {
            addCriterion("OPERID is null");
            return (Criteria) this;
        }

        public Criteria andOperidIsNotNull() {
            addCriterion("OPERID is not null");
            return (Criteria) this;
        }

        public Criteria andOperidEqualTo(String value) {
            addCriterion("OPERID =", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotEqualTo(String value) {
            addCriterion("OPERID <>", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidGreaterThan(String value) {
            addCriterion("OPERID >", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidGreaterThanOrEqualTo(String value) {
            addCriterion("OPERID >=", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLessThan(String value) {
            addCriterion("OPERID <", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLessThanOrEqualTo(String value) {
            addCriterion("OPERID <=", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLike(String value) {
            addCriterion("OPERID like", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotLike(String value) {
            addCriterion("OPERID not like", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidIn(List<String> values) {
            addCriterion("OPERID in", values, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotIn(List<String> values) {
            addCriterion("OPERID not in", values, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidBetween(String value1, String value2) {
            addCriterion("OPERID between", value1, value2, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotBetween(String value1, String value2) {
            addCriterion("OPERID not between", value1, value2, "operid");
            return (Criteria) this;
        }

        public Criteria andOperdateIsNull() {
            addCriterion("OPERDATE is null");
            return (Criteria) this;
        }

        public Criteria andOperdateIsNotNull() {
            addCriterion("OPERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOperdateEqualTo(Date value) {
            addCriterion("OPERDATE =", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotEqualTo(Date value) {
            addCriterion("OPERDATE <>", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateGreaterThan(Date value) {
            addCriterion("OPERDATE >", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERDATE >=", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateLessThan(Date value) {
            addCriterion("OPERDATE <", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateLessThanOrEqualTo(Date value) {
            addCriterion("OPERDATE <=", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateIn(List<Date> values) {
            addCriterion("OPERDATE in", values, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotIn(List<Date> values) {
            addCriterion("OPERDATE not in", values, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateBetween(Date value1, Date value2) {
            addCriterion("OPERDATE between", value1, value2, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotBetween(Date value1, Date value2) {
            addCriterion("OPERDATE not between", value1, value2, "operdate");
            return (Criteria) this;
        }

        public Criteria andRecversionIsNull() {
            addCriterion("RECVERSION is null");
            return (Criteria) this;
        }

        public Criteria andRecversionIsNotNull() {
            addCriterion("RECVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andRecversionEqualTo(Long value) {
            addCriterion("RECVERSION =", value, "recversion");
            return (Criteria) this;
        }

        public Criteria andRecversionNotEqualTo(Long value) {
            addCriterion("RECVERSION <>", value, "recversion");
            return (Criteria) this;
        }

        public Criteria andRecversionGreaterThan(Long value) {
            addCriterion("RECVERSION >", value, "recversion");
            return (Criteria) this;
        }

        public Criteria andRecversionGreaterThanOrEqualTo(Long value) {
            addCriterion("RECVERSION >=", value, "recversion");
            return (Criteria) this;
        }

        public Criteria andRecversionLessThan(Long value) {
            addCriterion("RECVERSION <", value, "recversion");
            return (Criteria) this;
        }

        public Criteria andRecversionLessThanOrEqualTo(Long value) {
            addCriterion("RECVERSION <=", value, "recversion");
            return (Criteria) this;
        }

        public Criteria andRecversionIn(List<Long> values) {
            addCriterion("RECVERSION in", values, "recversion");
            return (Criteria) this;
        }

        public Criteria andRecversionNotIn(List<Long> values) {
            addCriterion("RECVERSION not in", values, "recversion");
            return (Criteria) this;
        }

        public Criteria andRecversionBetween(Long value1, Long value2) {
            addCriterion("RECVERSION between", value1, value2, "recversion");
            return (Criteria) this;
        }

        public Criteria andRecversionNotBetween(Long value1, Long value2) {
            addCriterion("RECVERSION not between", value1, value2, "recversion");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SYS_BBS
     *
     * @mbggenerated do_not_delete_during_merge Mon Jul 29 11:41:31 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SYS_BBS
     *
     * @mbggenerated Mon Jul 29 11:41:31 CST 2013
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