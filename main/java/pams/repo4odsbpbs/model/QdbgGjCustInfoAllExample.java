package pams.repo4odsbpbs.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QdbgGjCustInfoAllExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QdbgGjCustInfoAllExample() {
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

        public Criteria andNodeIsNull() {
            addCriterion("NODE is null");
            return (Criteria) this;
        }

        public Criteria andNodeIsNotNull() {
            addCriterion("NODE is not null");
            return (Criteria) this;
        }

        public Criteria andNodeEqualTo(String value) {
            addCriterion("NODE =", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotEqualTo(String value) {
            addCriterion("NODE <>", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeGreaterThan(String value) {
            addCriterion("NODE >", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeGreaterThanOrEqualTo(String value) {
            addCriterion("NODE >=", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLessThan(String value) {
            addCriterion("NODE <", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLessThanOrEqualTo(String value) {
            addCriterion("NODE <=", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLike(String value) {
            addCriterion("NODE like", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotLike(String value) {
            addCriterion("NODE not like", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeIn(List<String> values) {
            addCriterion("NODE in", values, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotIn(List<String> values) {
            addCriterion("NODE not in", values, "node");
            return (Criteria) this;
        }

        public Criteria andNodeBetween(String value1, String value2) {
            addCriterion("NODE between", value1, value2, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotBetween(String value1, String value2) {
            addCriterion("NODE not between", value1, value2, "node");
            return (Criteria) this;
        }

        public Criteria andInstNoIsNull() {
            addCriterion("INST_NO is null");
            return (Criteria) this;
        }

        public Criteria andInstNoIsNotNull() {
            addCriterion("INST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInstNoEqualTo(String value) {
            addCriterion("INST_NO =", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoNotEqualTo(String value) {
            addCriterion("INST_NO <>", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoGreaterThan(String value) {
            addCriterion("INST_NO >", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoGreaterThanOrEqualTo(String value) {
            addCriterion("INST_NO >=", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoLessThan(String value) {
            addCriterion("INST_NO <", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoLessThanOrEqualTo(String value) {
            addCriterion("INST_NO <=", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoLike(String value) {
            addCriterion("INST_NO like", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoNotLike(String value) {
            addCriterion("INST_NO not like", value, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoIn(List<String> values) {
            addCriterion("INST_NO in", values, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoNotIn(List<String> values) {
            addCriterion("INST_NO not in", values, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoBetween(String value1, String value2) {
            addCriterion("INST_NO between", value1, value2, "instNo");
            return (Criteria) this;
        }

        public Criteria andInstNoNotBetween(String value1, String value2) {
            addCriterion("INST_NO not between", value1, value2, "instNo");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNull() {
            addCriterion("CUST_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNotNull() {
            addCriterion("CUST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustNoEqualTo(String value) {
            addCriterion("CUST_NO =", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotEqualTo(String value) {
            addCriterion("CUST_NO <>", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThan(String value) {
            addCriterion("CUST_NO >", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NO >=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThan(String value) {
            addCriterion("CUST_NO <", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_NO <=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLike(String value) {
            addCriterion("CUST_NO like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotLike(String value) {
            addCriterion("CUST_NO not like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoIn(List<String> values) {
            addCriterion("CUST_NO in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotIn(List<String> values) {
            addCriterion("CUST_NO not in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoBetween(String value1, String value2) {
            addCriterion("CUST_NO between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotBetween(String value1, String value2) {
            addCriterion("CUST_NO not between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNull() {
            addCriterion("CERT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("CERT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("CERT_NO =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("CERT_NO <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("CERT_NO >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_NO >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("CERT_NO <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("CERT_NO <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("CERT_NO like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("CERT_NO not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("CERT_NO in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("CERT_NO not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("CERT_NO between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("CERT_NO not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andAcctCountIsNull() {
            addCriterion("ACCT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andAcctCountIsNotNull() {
            addCriterion("ACCT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAcctCountEqualTo(BigDecimal value) {
            addCriterion("ACCT_COUNT =", value, "acctCount");
            return (Criteria) this;
        }

        public Criteria andAcctCountNotEqualTo(BigDecimal value) {
            addCriterion("ACCT_COUNT <>", value, "acctCount");
            return (Criteria) this;
        }

        public Criteria andAcctCountGreaterThan(BigDecimal value) {
            addCriterion("ACCT_COUNT >", value, "acctCount");
            return (Criteria) this;
        }

        public Criteria andAcctCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCT_COUNT >=", value, "acctCount");
            return (Criteria) this;
        }

        public Criteria andAcctCountLessThan(BigDecimal value) {
            addCriterion("ACCT_COUNT <", value, "acctCount");
            return (Criteria) this;
        }

        public Criteria andAcctCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCT_COUNT <=", value, "acctCount");
            return (Criteria) this;
        }

        public Criteria andAcctCountIn(List<BigDecimal> values) {
            addCriterion("ACCT_COUNT in", values, "acctCount");
            return (Criteria) this;
        }

        public Criteria andAcctCountNotIn(List<BigDecimal> values) {
            addCriterion("ACCT_COUNT not in", values, "acctCount");
            return (Criteria) this;
        }

        public Criteria andAcctCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCT_COUNT between", value1, value2, "acctCount");
            return (Criteria) this;
        }

        public Criteria andAcctCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCT_COUNT not between", value1, value2, "acctCount");
            return (Criteria) this;
        }

        public Criteria andHqCntIsNull() {
            addCriterion("HQ_CNT is null");
            return (Criteria) this;
        }

        public Criteria andHqCntIsNotNull() {
            addCriterion("HQ_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andHqCntEqualTo(BigDecimal value) {
            addCriterion("HQ_CNT =", value, "hqCnt");
            return (Criteria) this;
        }

        public Criteria andHqCntNotEqualTo(BigDecimal value) {
            addCriterion("HQ_CNT <>", value, "hqCnt");
            return (Criteria) this;
        }

        public Criteria andHqCntGreaterThan(BigDecimal value) {
            addCriterion("HQ_CNT >", value, "hqCnt");
            return (Criteria) this;
        }

        public Criteria andHqCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HQ_CNT >=", value, "hqCnt");
            return (Criteria) this;
        }

        public Criteria andHqCntLessThan(BigDecimal value) {
            addCriterion("HQ_CNT <", value, "hqCnt");
            return (Criteria) this;
        }

        public Criteria andHqCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HQ_CNT <=", value, "hqCnt");
            return (Criteria) this;
        }

        public Criteria andHqCntIn(List<BigDecimal> values) {
            addCriterion("HQ_CNT in", values, "hqCnt");
            return (Criteria) this;
        }

        public Criteria andHqCntNotIn(List<BigDecimal> values) {
            addCriterion("HQ_CNT not in", values, "hqCnt");
            return (Criteria) this;
        }

        public Criteria andHqCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HQ_CNT between", value1, value2, "hqCnt");
            return (Criteria) this;
        }

        public Criteria andHqCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HQ_CNT not between", value1, value2, "hqCnt");
            return (Criteria) this;
        }

        public Criteria andDqCntIsNull() {
            addCriterion("DQ_CNT is null");
            return (Criteria) this;
        }

        public Criteria andDqCntIsNotNull() {
            addCriterion("DQ_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andDqCntEqualTo(BigDecimal value) {
            addCriterion("DQ_CNT =", value, "dqCnt");
            return (Criteria) this;
        }

        public Criteria andDqCntNotEqualTo(BigDecimal value) {
            addCriterion("DQ_CNT <>", value, "dqCnt");
            return (Criteria) this;
        }

        public Criteria andDqCntGreaterThan(BigDecimal value) {
            addCriterion("DQ_CNT >", value, "dqCnt");
            return (Criteria) this;
        }

        public Criteria andDqCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DQ_CNT >=", value, "dqCnt");
            return (Criteria) this;
        }

        public Criteria andDqCntLessThan(BigDecimal value) {
            addCriterion("DQ_CNT <", value, "dqCnt");
            return (Criteria) this;
        }

        public Criteria andDqCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DQ_CNT <=", value, "dqCnt");
            return (Criteria) this;
        }

        public Criteria andDqCntIn(List<BigDecimal> values) {
            addCriterion("DQ_CNT in", values, "dqCnt");
            return (Criteria) this;
        }

        public Criteria andDqCntNotIn(List<BigDecimal> values) {
            addCriterion("DQ_CNT not in", values, "dqCnt");
            return (Criteria) this;
        }

        public Criteria andDqCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DQ_CNT between", value1, value2, "dqCnt");
            return (Criteria) this;
        }

        public Criteria andDqCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DQ_CNT not between", value1, value2, "dqCnt");
            return (Criteria) this;
        }

        public Criteria andHqCurrBalIsNull() {
            addCriterion("HQ_CURR_BAL is null");
            return (Criteria) this;
        }

        public Criteria andHqCurrBalIsNotNull() {
            addCriterion("HQ_CURR_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andHqCurrBalEqualTo(BigDecimal value) {
            addCriterion("HQ_CURR_BAL =", value, "hqCurrBal");
            return (Criteria) this;
        }

        public Criteria andHqCurrBalNotEqualTo(BigDecimal value) {
            addCriterion("HQ_CURR_BAL <>", value, "hqCurrBal");
            return (Criteria) this;
        }

        public Criteria andHqCurrBalGreaterThan(BigDecimal value) {
            addCriterion("HQ_CURR_BAL >", value, "hqCurrBal");
            return (Criteria) this;
        }

        public Criteria andHqCurrBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HQ_CURR_BAL >=", value, "hqCurrBal");
            return (Criteria) this;
        }

        public Criteria andHqCurrBalLessThan(BigDecimal value) {
            addCriterion("HQ_CURR_BAL <", value, "hqCurrBal");
            return (Criteria) this;
        }

        public Criteria andHqCurrBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HQ_CURR_BAL <=", value, "hqCurrBal");
            return (Criteria) this;
        }

        public Criteria andHqCurrBalIn(List<BigDecimal> values) {
            addCriterion("HQ_CURR_BAL in", values, "hqCurrBal");
            return (Criteria) this;
        }

        public Criteria andHqCurrBalNotIn(List<BigDecimal> values) {
            addCriterion("HQ_CURR_BAL not in", values, "hqCurrBal");
            return (Criteria) this;
        }

        public Criteria andHqCurrBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HQ_CURR_BAL between", value1, value2, "hqCurrBal");
            return (Criteria) this;
        }

        public Criteria andHqCurrBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HQ_CURR_BAL not between", value1, value2, "hqCurrBal");
            return (Criteria) this;
        }

        public Criteria andDqCurrBalIsNull() {
            addCriterion("DQ_CURR_BAL is null");
            return (Criteria) this;
        }

        public Criteria andDqCurrBalIsNotNull() {
            addCriterion("DQ_CURR_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andDqCurrBalEqualTo(BigDecimal value) {
            addCriterion("DQ_CURR_BAL =", value, "dqCurrBal");
            return (Criteria) this;
        }

        public Criteria andDqCurrBalNotEqualTo(BigDecimal value) {
            addCriterion("DQ_CURR_BAL <>", value, "dqCurrBal");
            return (Criteria) this;
        }

        public Criteria andDqCurrBalGreaterThan(BigDecimal value) {
            addCriterion("DQ_CURR_BAL >", value, "dqCurrBal");
            return (Criteria) this;
        }

        public Criteria andDqCurrBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DQ_CURR_BAL >=", value, "dqCurrBal");
            return (Criteria) this;
        }

        public Criteria andDqCurrBalLessThan(BigDecimal value) {
            addCriterion("DQ_CURR_BAL <", value, "dqCurrBal");
            return (Criteria) this;
        }

        public Criteria andDqCurrBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DQ_CURR_BAL <=", value, "dqCurrBal");
            return (Criteria) this;
        }

        public Criteria andDqCurrBalIn(List<BigDecimal> values) {
            addCriterion("DQ_CURR_BAL in", values, "dqCurrBal");
            return (Criteria) this;
        }

        public Criteria andDqCurrBalNotIn(List<BigDecimal> values) {
            addCriterion("DQ_CURR_BAL not in", values, "dqCurrBal");
            return (Criteria) this;
        }

        public Criteria andDqCurrBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DQ_CURR_BAL between", value1, value2, "dqCurrBal");
            return (Criteria) this;
        }

        public Criteria andDqCurrBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DQ_CURR_BAL not between", value1, value2, "dqCurrBal");
            return (Criteria) this;
        }

        public Criteria andDepTotalIsNull() {
            addCriterion("DEP_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andDepTotalIsNotNull() {
            addCriterion("DEP_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andDepTotalEqualTo(BigDecimal value) {
            addCriterion("DEP_TOTAL =", value, "depTotal");
            return (Criteria) this;
        }

        public Criteria andDepTotalNotEqualTo(BigDecimal value) {
            addCriterion("DEP_TOTAL <>", value, "depTotal");
            return (Criteria) this;
        }

        public Criteria andDepTotalGreaterThan(BigDecimal value) {
            addCriterion("DEP_TOTAL >", value, "depTotal");
            return (Criteria) this;
        }

        public Criteria andDepTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEP_TOTAL >=", value, "depTotal");
            return (Criteria) this;
        }

        public Criteria andDepTotalLessThan(BigDecimal value) {
            addCriterion("DEP_TOTAL <", value, "depTotal");
            return (Criteria) this;
        }

        public Criteria andDepTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEP_TOTAL <=", value, "depTotal");
            return (Criteria) this;
        }

        public Criteria andDepTotalIn(List<BigDecimal> values) {
            addCriterion("DEP_TOTAL in", values, "depTotal");
            return (Criteria) this;
        }

        public Criteria andDepTotalNotIn(List<BigDecimal> values) {
            addCriterion("DEP_TOTAL not in", values, "depTotal");
            return (Criteria) this;
        }

        public Criteria andDepTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEP_TOTAL between", value1, value2, "depTotal");
            return (Criteria) this;
        }

        public Criteria andDepTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEP_TOTAL not between", value1, value2, "depTotal");
            return (Criteria) this;
        }

        public Criteria andCrdCrtCountIsNull() {
            addCriterion("CRD_CRT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCrdCrtCountIsNotNull() {
            addCriterion("CRD_CRT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCrdCrtCountEqualTo(BigDecimal value) {
            addCriterion("CRD_CRT_COUNT =", value, "crdCrtCount");
            return (Criteria) this;
        }

        public Criteria andCrdCrtCountNotEqualTo(BigDecimal value) {
            addCriterion("CRD_CRT_COUNT <>", value, "crdCrtCount");
            return (Criteria) this;
        }

        public Criteria andCrdCrtCountGreaterThan(BigDecimal value) {
            addCriterion("CRD_CRT_COUNT >", value, "crdCrtCount");
            return (Criteria) this;
        }

        public Criteria andCrdCrtCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CRD_CRT_COUNT >=", value, "crdCrtCount");
            return (Criteria) this;
        }

        public Criteria andCrdCrtCountLessThan(BigDecimal value) {
            addCriterion("CRD_CRT_COUNT <", value, "crdCrtCount");
            return (Criteria) this;
        }

        public Criteria andCrdCrtCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CRD_CRT_COUNT <=", value, "crdCrtCount");
            return (Criteria) this;
        }

        public Criteria andCrdCrtCountIn(List<BigDecimal> values) {
            addCriterion("CRD_CRT_COUNT in", values, "crdCrtCount");
            return (Criteria) this;
        }

        public Criteria andCrdCrtCountNotIn(List<BigDecimal> values) {
            addCriterion("CRD_CRT_COUNT not in", values, "crdCrtCount");
            return (Criteria) this;
        }

        public Criteria andCrdCrtCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRD_CRT_COUNT between", value1, value2, "crdCrtCount");
            return (Criteria) this;
        }

        public Criteria andCrdCrtCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRD_CRT_COUNT not between", value1, value2, "crdCrtCount");
            return (Criteria) this;
        }

        public Criteria andCrdActivIsNull() {
            addCriterion("CRD_ACTIV is null");
            return (Criteria) this;
        }

        public Criteria andCrdActivIsNotNull() {
            addCriterion("CRD_ACTIV is not null");
            return (Criteria) this;
        }

        public Criteria andCrdActivEqualTo(BigDecimal value) {
            addCriterion("CRD_ACTIV =", value, "crdActiv");
            return (Criteria) this;
        }

        public Criteria andCrdActivNotEqualTo(BigDecimal value) {
            addCriterion("CRD_ACTIV <>", value, "crdActiv");
            return (Criteria) this;
        }

        public Criteria andCrdActivGreaterThan(BigDecimal value) {
            addCriterion("CRD_ACTIV >", value, "crdActiv");
            return (Criteria) this;
        }

        public Criteria andCrdActivGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CRD_ACTIV >=", value, "crdActiv");
            return (Criteria) this;
        }

        public Criteria andCrdActivLessThan(BigDecimal value) {
            addCriterion("CRD_ACTIV <", value, "crdActiv");
            return (Criteria) this;
        }

        public Criteria andCrdActivLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CRD_ACTIV <=", value, "crdActiv");
            return (Criteria) this;
        }

        public Criteria andCrdActivIn(List<BigDecimal> values) {
            addCriterion("CRD_ACTIV in", values, "crdActiv");
            return (Criteria) this;
        }

        public Criteria andCrdActivNotIn(List<BigDecimal> values) {
            addCriterion("CRD_ACTIV not in", values, "crdActiv");
            return (Criteria) this;
        }

        public Criteria andCrdActivBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRD_ACTIV between", value1, value2, "crdActiv");
            return (Criteria) this;
        }

        public Criteria andCrdActivNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRD_ACTIV not between", value1, value2, "crdActiv");
            return (Criteria) this;
        }

        public Criteria andCrdNoActivIsNull() {
            addCriterion("CRD_NO_ACTIV is null");
            return (Criteria) this;
        }

        public Criteria andCrdNoActivIsNotNull() {
            addCriterion("CRD_NO_ACTIV is not null");
            return (Criteria) this;
        }

        public Criteria andCrdNoActivEqualTo(BigDecimal value) {
            addCriterion("CRD_NO_ACTIV =", value, "crdNoActiv");
            return (Criteria) this;
        }

        public Criteria andCrdNoActivNotEqualTo(BigDecimal value) {
            addCriterion("CRD_NO_ACTIV <>", value, "crdNoActiv");
            return (Criteria) this;
        }

        public Criteria andCrdNoActivGreaterThan(BigDecimal value) {
            addCriterion("CRD_NO_ACTIV >", value, "crdNoActiv");
            return (Criteria) this;
        }

        public Criteria andCrdNoActivGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CRD_NO_ACTIV >=", value, "crdNoActiv");
            return (Criteria) this;
        }

        public Criteria andCrdNoActivLessThan(BigDecimal value) {
            addCriterion("CRD_NO_ACTIV <", value, "crdNoActiv");
            return (Criteria) this;
        }

        public Criteria andCrdNoActivLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CRD_NO_ACTIV <=", value, "crdNoActiv");
            return (Criteria) this;
        }

        public Criteria andCrdNoActivIn(List<BigDecimal> values) {
            addCriterion("CRD_NO_ACTIV in", values, "crdNoActiv");
            return (Criteria) this;
        }

        public Criteria andCrdNoActivNotIn(List<BigDecimal> values) {
            addCriterion("CRD_NO_ACTIV not in", values, "crdNoActiv");
            return (Criteria) this;
        }

        public Criteria andCrdNoActivBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRD_NO_ACTIV between", value1, value2, "crdNoActiv");
            return (Criteria) this;
        }

        public Criteria andCrdNoActivNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRD_NO_ACTIV not between", value1, value2, "crdNoActiv");
            return (Criteria) this;
        }

        public Criteria andLnCustCntIsNull() {
            addCriterion("LN_CUST_CNT is null");
            return (Criteria) this;
        }

        public Criteria andLnCustCntIsNotNull() {
            addCriterion("LN_CUST_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andLnCustCntEqualTo(BigDecimal value) {
            addCriterion("LN_CUST_CNT =", value, "lnCustCnt");
            return (Criteria) this;
        }

        public Criteria andLnCustCntNotEqualTo(BigDecimal value) {
            addCriterion("LN_CUST_CNT <>", value, "lnCustCnt");
            return (Criteria) this;
        }

        public Criteria andLnCustCntGreaterThan(BigDecimal value) {
            addCriterion("LN_CUST_CNT >", value, "lnCustCnt");
            return (Criteria) this;
        }

        public Criteria andLnCustCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LN_CUST_CNT >=", value, "lnCustCnt");
            return (Criteria) this;
        }

        public Criteria andLnCustCntLessThan(BigDecimal value) {
            addCriterion("LN_CUST_CNT <", value, "lnCustCnt");
            return (Criteria) this;
        }

        public Criteria andLnCustCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LN_CUST_CNT <=", value, "lnCustCnt");
            return (Criteria) this;
        }

        public Criteria andLnCustCntIn(List<BigDecimal> values) {
            addCriterion("LN_CUST_CNT in", values, "lnCustCnt");
            return (Criteria) this;
        }

        public Criteria andLnCustCntNotIn(List<BigDecimal> values) {
            addCriterion("LN_CUST_CNT not in", values, "lnCustCnt");
            return (Criteria) this;
        }

        public Criteria andLnCustCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LN_CUST_CNT between", value1, value2, "lnCustCnt");
            return (Criteria) this;
        }

        public Criteria andLnCustCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LN_CUST_CNT not between", value1, value2, "lnCustCnt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtIsNull() {
            addCriterion("LOAN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmtIsNotNull() {
            addCriterion("LOAN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmtEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMT =", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtNotEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMT <>", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtGreaterThan(BigDecimal value) {
            addCriterion("LOAN_AMT >", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMT >=", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtLessThan(BigDecimal value) {
            addCriterion("LOAN_AMT <", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMT <=", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtIn(List<BigDecimal> values) {
            addCriterion("LOAN_AMT in", values, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtNotIn(List<BigDecimal> values) {
            addCriterion("LOAN_AMT not in", values, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOAN_AMT between", value1, value2, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOAN_AMT not between", value1, value2, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNull() {
            addCriterion("LOAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNotNull() {
            addCriterion("LOAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDateEqualTo(BigDecimal value) {
            addCriterion("LOAN_DATE =", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotEqualTo(BigDecimal value) {
            addCriterion("LOAN_DATE <>", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThan(BigDecimal value) {
            addCriterion("LOAN_DATE >", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOAN_DATE >=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThan(BigDecimal value) {
            addCriterion("LOAN_DATE <", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOAN_DATE <=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateIn(List<BigDecimal> values) {
            addCriterion("LOAN_DATE in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotIn(List<BigDecimal> values) {
            addCriterion("LOAN_DATE not in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOAN_DATE between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOAN_DATE not between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanBalIsNull() {
            addCriterion("LOAN_BAL is null");
            return (Criteria) this;
        }

        public Criteria andLoanBalIsNotNull() {
            addCriterion("LOAN_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andLoanBalEqualTo(BigDecimal value) {
            addCriterion("LOAN_BAL =", value, "loanBal");
            return (Criteria) this;
        }

        public Criteria andLoanBalNotEqualTo(BigDecimal value) {
            addCriterion("LOAN_BAL <>", value, "loanBal");
            return (Criteria) this;
        }

        public Criteria andLoanBalGreaterThan(BigDecimal value) {
            addCriterion("LOAN_BAL >", value, "loanBal");
            return (Criteria) this;
        }

        public Criteria andLoanBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOAN_BAL >=", value, "loanBal");
            return (Criteria) this;
        }

        public Criteria andLoanBalLessThan(BigDecimal value) {
            addCriterion("LOAN_BAL <", value, "loanBal");
            return (Criteria) this;
        }

        public Criteria andLoanBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOAN_BAL <=", value, "loanBal");
            return (Criteria) this;
        }

        public Criteria andLoanBalIn(List<BigDecimal> values) {
            addCriterion("LOAN_BAL in", values, "loanBal");
            return (Criteria) this;
        }

        public Criteria andLoanBalNotIn(List<BigDecimal> values) {
            addCriterion("LOAN_BAL not in", values, "loanBal");
            return (Criteria) this;
        }

        public Criteria andLoanBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOAN_BAL between", value1, value2, "loanBal");
            return (Criteria) this;
        }

        public Criteria andLoanBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOAN_BAL not between", value1, value2, "loanBal");
            return (Criteria) this;
        }

        public Criteria andFsTypIsNull() {
            addCriterion("FS_TYP is null");
            return (Criteria) this;
        }

        public Criteria andFsTypIsNotNull() {
            addCriterion("FS_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andFsTypEqualTo(String value) {
            addCriterion("FS_TYP =", value, "fsTyp");
            return (Criteria) this;
        }

        public Criteria andFsTypNotEqualTo(String value) {
            addCriterion("FS_TYP <>", value, "fsTyp");
            return (Criteria) this;
        }

        public Criteria andFsTypGreaterThan(String value) {
            addCriterion("FS_TYP >", value, "fsTyp");
            return (Criteria) this;
        }

        public Criteria andFsTypGreaterThanOrEqualTo(String value) {
            addCriterion("FS_TYP >=", value, "fsTyp");
            return (Criteria) this;
        }

        public Criteria andFsTypLessThan(String value) {
            addCriterion("FS_TYP <", value, "fsTyp");
            return (Criteria) this;
        }

        public Criteria andFsTypLessThanOrEqualTo(String value) {
            addCriterion("FS_TYP <=", value, "fsTyp");
            return (Criteria) this;
        }

        public Criteria andFsTypLike(String value) {
            addCriterion("FS_TYP like", value, "fsTyp");
            return (Criteria) this;
        }

        public Criteria andFsTypNotLike(String value) {
            addCriterion("FS_TYP not like", value, "fsTyp");
            return (Criteria) this;
        }

        public Criteria andFsTypIn(List<String> values) {
            addCriterion("FS_TYP in", values, "fsTyp");
            return (Criteria) this;
        }

        public Criteria andFsTypNotIn(List<String> values) {
            addCriterion("FS_TYP not in", values, "fsTyp");
            return (Criteria) this;
        }

        public Criteria andFsTypBetween(String value1, String value2) {
            addCriterion("FS_TYP between", value1, value2, "fsTyp");
            return (Criteria) this;
        }

        public Criteria andFsTypNotBetween(String value1, String value2) {
            addCriterion("FS_TYP not between", value1, value2, "fsTyp");
            return (Criteria) this;
        }

        public Criteria andProductCntIsNull() {
            addCriterion("PRODUCT_CNT is null");
            return (Criteria) this;
        }

        public Criteria andProductCntIsNotNull() {
            addCriterion("PRODUCT_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andProductCntEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_CNT =", value, "productCnt");
            return (Criteria) this;
        }

        public Criteria andProductCntNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_CNT <>", value, "productCnt");
            return (Criteria) this;
        }

        public Criteria andProductCntGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_CNT >", value, "productCnt");
            return (Criteria) this;
        }

        public Criteria andProductCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_CNT >=", value, "productCnt");
            return (Criteria) this;
        }

        public Criteria andProductCntLessThan(BigDecimal value) {
            addCriterion("PRODUCT_CNT <", value, "productCnt");
            return (Criteria) this;
        }

        public Criteria andProductCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_CNT <=", value, "productCnt");
            return (Criteria) this;
        }

        public Criteria andProductCntIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_CNT in", values, "productCnt");
            return (Criteria) this;
        }

        public Criteria andProductCntNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_CNT not in", values, "productCnt");
            return (Criteria) this;
        }

        public Criteria andProductCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_CNT between", value1, value2, "productCnt");
            return (Criteria) this;
        }

        public Criteria andProductCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_CNT not between", value1, value2, "productCnt");
            return (Criteria) this;
        }

        public Criteria andCurrAmtIsNull() {
            addCriterion("CURR_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCurrAmtIsNotNull() {
            addCriterion("CURR_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCurrAmtEqualTo(BigDecimal value) {
            addCriterion("CURR_AMT =", value, "currAmt");
            return (Criteria) this;
        }

        public Criteria andCurrAmtNotEqualTo(BigDecimal value) {
            addCriterion("CURR_AMT <>", value, "currAmt");
            return (Criteria) this;
        }

        public Criteria andCurrAmtGreaterThan(BigDecimal value) {
            addCriterion("CURR_AMT >", value, "currAmt");
            return (Criteria) this;
        }

        public Criteria andCurrAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURR_AMT >=", value, "currAmt");
            return (Criteria) this;
        }

        public Criteria andCurrAmtLessThan(BigDecimal value) {
            addCriterion("CURR_AMT <", value, "currAmt");
            return (Criteria) this;
        }

        public Criteria andCurrAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURR_AMT <=", value, "currAmt");
            return (Criteria) this;
        }

        public Criteria andCurrAmtIn(List<BigDecimal> values) {
            addCriterion("CURR_AMT in", values, "currAmt");
            return (Criteria) this;
        }

        public Criteria andCurrAmtNotIn(List<BigDecimal> values) {
            addCriterion("CURR_AMT not in", values, "currAmt");
            return (Criteria) this;
        }

        public Criteria andCurrAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURR_AMT between", value1, value2, "currAmt");
            return (Criteria) this;
        }

        public Criteria andCurrAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURR_AMT not between", value1, value2, "currAmt");
            return (Criteria) this;
        }

        public Criteria andFRealsharesIsNull() {
            addCriterion("F_REALSHARES is null");
            return (Criteria) this;
        }

        public Criteria andFRealsharesIsNotNull() {
            addCriterion("F_REALSHARES is not null");
            return (Criteria) this;
        }

        public Criteria andFRealsharesEqualTo(BigDecimal value) {
            addCriterion("F_REALSHARES =", value, "fRealshares");
            return (Criteria) this;
        }

        public Criteria andFRealsharesNotEqualTo(BigDecimal value) {
            addCriterion("F_REALSHARES <>", value, "fRealshares");
            return (Criteria) this;
        }

        public Criteria andFRealsharesGreaterThan(BigDecimal value) {
            addCriterion("F_REALSHARES >", value, "fRealshares");
            return (Criteria) this;
        }

        public Criteria andFRealsharesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("F_REALSHARES >=", value, "fRealshares");
            return (Criteria) this;
        }

        public Criteria andFRealsharesLessThan(BigDecimal value) {
            addCriterion("F_REALSHARES <", value, "fRealshares");
            return (Criteria) this;
        }

        public Criteria andFRealsharesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("F_REALSHARES <=", value, "fRealshares");
            return (Criteria) this;
        }

        public Criteria andFRealsharesIn(List<BigDecimal> values) {
            addCriterion("F_REALSHARES in", values, "fRealshares");
            return (Criteria) this;
        }

        public Criteria andFRealsharesNotIn(List<BigDecimal> values) {
            addCriterion("F_REALSHARES not in", values, "fRealshares");
            return (Criteria) this;
        }

        public Criteria andFRealsharesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_REALSHARES between", value1, value2, "fRealshares");
            return (Criteria) this;
        }

        public Criteria andFRealsharesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_REALSHARES not between", value1, value2, "fRealshares");
            return (Criteria) this;
        }

        public Criteria andFundTypIsNull() {
            addCriterion("FUND_TYP is null");
            return (Criteria) this;
        }

        public Criteria andFundTypIsNotNull() {
            addCriterion("FUND_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andFundTypEqualTo(String value) {
            addCriterion("FUND_TYP =", value, "fundTyp");
            return (Criteria) this;
        }

        public Criteria andFundTypNotEqualTo(String value) {
            addCriterion("FUND_TYP <>", value, "fundTyp");
            return (Criteria) this;
        }

        public Criteria andFundTypGreaterThan(String value) {
            addCriterion("FUND_TYP >", value, "fundTyp");
            return (Criteria) this;
        }

        public Criteria andFundTypGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_TYP >=", value, "fundTyp");
            return (Criteria) this;
        }

        public Criteria andFundTypLessThan(String value) {
            addCriterion("FUND_TYP <", value, "fundTyp");
            return (Criteria) this;
        }

        public Criteria andFundTypLessThanOrEqualTo(String value) {
            addCriterion("FUND_TYP <=", value, "fundTyp");
            return (Criteria) this;
        }

        public Criteria andFundTypLike(String value) {
            addCriterion("FUND_TYP like", value, "fundTyp");
            return (Criteria) this;
        }

        public Criteria andFundTypNotLike(String value) {
            addCriterion("FUND_TYP not like", value, "fundTyp");
            return (Criteria) this;
        }

        public Criteria andFundTypIn(List<String> values) {
            addCriterion("FUND_TYP in", values, "fundTyp");
            return (Criteria) this;
        }

        public Criteria andFundTypNotIn(List<String> values) {
            addCriterion("FUND_TYP not in", values, "fundTyp");
            return (Criteria) this;
        }

        public Criteria andFundTypBetween(String value1, String value2) {
            addCriterion("FUND_TYP between", value1, value2, "fundTyp");
            return (Criteria) this;
        }

        public Criteria andFundTypNotBetween(String value1, String value2) {
            addCriterion("FUND_TYP not between", value1, value2, "fundTyp");
            return (Criteria) this;
        }

        public Criteria andFundCntIsNull() {
            addCriterion("FUND_CNT is null");
            return (Criteria) this;
        }

        public Criteria andFundCntIsNotNull() {
            addCriterion("FUND_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andFundCntEqualTo(BigDecimal value) {
            addCriterion("FUND_CNT =", value, "fundCnt");
            return (Criteria) this;
        }

        public Criteria andFundCntNotEqualTo(BigDecimal value) {
            addCriterion("FUND_CNT <>", value, "fundCnt");
            return (Criteria) this;
        }

        public Criteria andFundCntGreaterThan(BigDecimal value) {
            addCriterion("FUND_CNT >", value, "fundCnt");
            return (Criteria) this;
        }

        public Criteria andFundCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUND_CNT >=", value, "fundCnt");
            return (Criteria) this;
        }

        public Criteria andFundCntLessThan(BigDecimal value) {
            addCriterion("FUND_CNT <", value, "fundCnt");
            return (Criteria) this;
        }

        public Criteria andFundCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUND_CNT <=", value, "fundCnt");
            return (Criteria) this;
        }

        public Criteria andFundCntIn(List<BigDecimal> values) {
            addCriterion("FUND_CNT in", values, "fundCnt");
            return (Criteria) this;
        }

        public Criteria andFundCntNotIn(List<BigDecimal> values) {
            addCriterion("FUND_CNT not in", values, "fundCnt");
            return (Criteria) this;
        }

        public Criteria andFundCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUND_CNT between", value1, value2, "fundCnt");
            return (Criteria) this;
        }

        public Criteria andFundCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUND_CNT not between", value1, value2, "fundCnt");
            return (Criteria) this;
        }

        public Criteria andFundCostIsNull() {
            addCriterion("FUND_COST is null");
            return (Criteria) this;
        }

        public Criteria andFundCostIsNotNull() {
            addCriterion("FUND_COST is not null");
            return (Criteria) this;
        }

        public Criteria andFundCostEqualTo(BigDecimal value) {
            addCriterion("FUND_COST =", value, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostNotEqualTo(BigDecimal value) {
            addCriterion("FUND_COST <>", value, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostGreaterThan(BigDecimal value) {
            addCriterion("FUND_COST >", value, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUND_COST >=", value, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostLessThan(BigDecimal value) {
            addCriterion("FUND_COST <", value, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUND_COST <=", value, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostIn(List<BigDecimal> values) {
            addCriterion("FUND_COST in", values, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostNotIn(List<BigDecimal> values) {
            addCriterion("FUND_COST not in", values, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUND_COST between", value1, value2, "fundCost");
            return (Criteria) this;
        }

        public Criteria andFundCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUND_COST not between", value1, value2, "fundCost");
            return (Criteria) this;
        }

        public Criteria andCtsTypIsNull() {
            addCriterion("CTS_TYP is null");
            return (Criteria) this;
        }

        public Criteria andCtsTypIsNotNull() {
            addCriterion("CTS_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andCtsTypEqualTo(String value) {
            addCriterion("CTS_TYP =", value, "ctsTyp");
            return (Criteria) this;
        }

        public Criteria andCtsTypNotEqualTo(String value) {
            addCriterion("CTS_TYP <>", value, "ctsTyp");
            return (Criteria) this;
        }

        public Criteria andCtsTypGreaterThan(String value) {
            addCriterion("CTS_TYP >", value, "ctsTyp");
            return (Criteria) this;
        }

        public Criteria andCtsTypGreaterThanOrEqualTo(String value) {
            addCriterion("CTS_TYP >=", value, "ctsTyp");
            return (Criteria) this;
        }

        public Criteria andCtsTypLessThan(String value) {
            addCriterion("CTS_TYP <", value, "ctsTyp");
            return (Criteria) this;
        }

        public Criteria andCtsTypLessThanOrEqualTo(String value) {
            addCriterion("CTS_TYP <=", value, "ctsTyp");
            return (Criteria) this;
        }

        public Criteria andCtsTypLike(String value) {
            addCriterion("CTS_TYP like", value, "ctsTyp");
            return (Criteria) this;
        }

        public Criteria andCtsTypNotLike(String value) {
            addCriterion("CTS_TYP not like", value, "ctsTyp");
            return (Criteria) this;
        }

        public Criteria andCtsTypIn(List<String> values) {
            addCriterion("CTS_TYP in", values, "ctsTyp");
            return (Criteria) this;
        }

        public Criteria andCtsTypNotIn(List<String> values) {
            addCriterion("CTS_TYP not in", values, "ctsTyp");
            return (Criteria) this;
        }

        public Criteria andCtsTypBetween(String value1, String value2) {
            addCriterion("CTS_TYP between", value1, value2, "ctsTyp");
            return (Criteria) this;
        }

        public Criteria andCtsTypNotBetween(String value1, String value2) {
            addCriterion("CTS_TYP not between", value1, value2, "ctsTyp");
            return (Criteria) this;
        }

        public Criteria andCtsSumbalIsNull() {
            addCriterion("CTS_SUMBAL is null");
            return (Criteria) this;
        }

        public Criteria andCtsSumbalIsNotNull() {
            addCriterion("CTS_SUMBAL is not null");
            return (Criteria) this;
        }

        public Criteria andCtsSumbalEqualTo(BigDecimal value) {
            addCriterion("CTS_SUMBAL =", value, "ctsSumbal");
            return (Criteria) this;
        }

        public Criteria andCtsSumbalNotEqualTo(BigDecimal value) {
            addCriterion("CTS_SUMBAL <>", value, "ctsSumbal");
            return (Criteria) this;
        }

        public Criteria andCtsSumbalGreaterThan(BigDecimal value) {
            addCriterion("CTS_SUMBAL >", value, "ctsSumbal");
            return (Criteria) this;
        }

        public Criteria andCtsSumbalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CTS_SUMBAL >=", value, "ctsSumbal");
            return (Criteria) this;
        }

        public Criteria andCtsSumbalLessThan(BigDecimal value) {
            addCriterion("CTS_SUMBAL <", value, "ctsSumbal");
            return (Criteria) this;
        }

        public Criteria andCtsSumbalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CTS_SUMBAL <=", value, "ctsSumbal");
            return (Criteria) this;
        }

        public Criteria andCtsSumbalIn(List<BigDecimal> values) {
            addCriterion("CTS_SUMBAL in", values, "ctsSumbal");
            return (Criteria) this;
        }

        public Criteria andCtsSumbalNotIn(List<BigDecimal> values) {
            addCriterion("CTS_SUMBAL not in", values, "ctsSumbal");
            return (Criteria) this;
        }

        public Criteria andCtsSumbalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CTS_SUMBAL between", value1, value2, "ctsSumbal");
            return (Criteria) this;
        }

        public Criteria andCtsSumbalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CTS_SUMBAL not between", value1, value2, "ctsSumbal");
            return (Criteria) this;
        }

        public Criteria andEctipTypIsNull() {
            addCriterion("ECTIP_TYP is null");
            return (Criteria) this;
        }

        public Criteria andEctipTypIsNotNull() {
            addCriterion("ECTIP_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andEctipTypEqualTo(String value) {
            addCriterion("ECTIP_TYP =", value, "ectipTyp");
            return (Criteria) this;
        }

        public Criteria andEctipTypNotEqualTo(String value) {
            addCriterion("ECTIP_TYP <>", value, "ectipTyp");
            return (Criteria) this;
        }

        public Criteria andEctipTypGreaterThan(String value) {
            addCriterion("ECTIP_TYP >", value, "ectipTyp");
            return (Criteria) this;
        }

        public Criteria andEctipTypGreaterThanOrEqualTo(String value) {
            addCriterion("ECTIP_TYP >=", value, "ectipTyp");
            return (Criteria) this;
        }

        public Criteria andEctipTypLessThan(String value) {
            addCriterion("ECTIP_TYP <", value, "ectipTyp");
            return (Criteria) this;
        }

        public Criteria andEctipTypLessThanOrEqualTo(String value) {
            addCriterion("ECTIP_TYP <=", value, "ectipTyp");
            return (Criteria) this;
        }

        public Criteria andEctipTypLike(String value) {
            addCriterion("ECTIP_TYP like", value, "ectipTyp");
            return (Criteria) this;
        }

        public Criteria andEctipTypNotLike(String value) {
            addCriterion("ECTIP_TYP not like", value, "ectipTyp");
            return (Criteria) this;
        }

        public Criteria andEctipTypIn(List<String> values) {
            addCriterion("ECTIP_TYP in", values, "ectipTyp");
            return (Criteria) this;
        }

        public Criteria andEctipTypNotIn(List<String> values) {
            addCriterion("ECTIP_TYP not in", values, "ectipTyp");
            return (Criteria) this;
        }

        public Criteria andEctipTypBetween(String value1, String value2) {
            addCriterion("ECTIP_TYP between", value1, value2, "ectipTyp");
            return (Criteria) this;
        }

        public Criteria andEctipTypNotBetween(String value1, String value2) {
            addCriterion("ECTIP_TYP not between", value1, value2, "ectipTyp");
            return (Criteria) this;
        }

        public Criteria andChnNoIsNull() {
            addCriterion("CHN_NO is null");
            return (Criteria) this;
        }

        public Criteria andChnNoIsNotNull() {
            addCriterion("CHN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andChnNoEqualTo(String value) {
            addCriterion("CHN_NO =", value, "chnNo");
            return (Criteria) this;
        }

        public Criteria andChnNoNotEqualTo(String value) {
            addCriterion("CHN_NO <>", value, "chnNo");
            return (Criteria) this;
        }

        public Criteria andChnNoGreaterThan(String value) {
            addCriterion("CHN_NO >", value, "chnNo");
            return (Criteria) this;
        }

        public Criteria andChnNoGreaterThanOrEqualTo(String value) {
            addCriterion("CHN_NO >=", value, "chnNo");
            return (Criteria) this;
        }

        public Criteria andChnNoLessThan(String value) {
            addCriterion("CHN_NO <", value, "chnNo");
            return (Criteria) this;
        }

        public Criteria andChnNoLessThanOrEqualTo(String value) {
            addCriterion("CHN_NO <=", value, "chnNo");
            return (Criteria) this;
        }

        public Criteria andChnNoLike(String value) {
            addCriterion("CHN_NO like", value, "chnNo");
            return (Criteria) this;
        }

        public Criteria andChnNoNotLike(String value) {
            addCriterion("CHN_NO not like", value, "chnNo");
            return (Criteria) this;
        }

        public Criteria andChnNoIn(List<String> values) {
            addCriterion("CHN_NO in", values, "chnNo");
            return (Criteria) this;
        }

        public Criteria andChnNoNotIn(List<String> values) {
            addCriterion("CHN_NO not in", values, "chnNo");
            return (Criteria) this;
        }

        public Criteria andChnNoBetween(String value1, String value2) {
            addCriterion("CHN_NO between", value1, value2, "chnNo");
            return (Criteria) this;
        }

        public Criteria andChnNoNotBetween(String value1, String value2) {
            addCriterion("CHN_NO not between", value1, value2, "chnNo");
            return (Criteria) this;
        }

        public Criteria andFinTotalIsNull() {
            addCriterion("FIN_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andFinTotalIsNotNull() {
            addCriterion("FIN_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andFinTotalEqualTo(BigDecimal value) {
            addCriterion("FIN_TOTAL =", value, "finTotal");
            return (Criteria) this;
        }

        public Criteria andFinTotalNotEqualTo(BigDecimal value) {
            addCriterion("FIN_TOTAL <>", value, "finTotal");
            return (Criteria) this;
        }

        public Criteria andFinTotalGreaterThan(BigDecimal value) {
            addCriterion("FIN_TOTAL >", value, "finTotal");
            return (Criteria) this;
        }

        public Criteria andFinTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIN_TOTAL >=", value, "finTotal");
            return (Criteria) this;
        }

        public Criteria andFinTotalLessThan(BigDecimal value) {
            addCriterion("FIN_TOTAL <", value, "finTotal");
            return (Criteria) this;
        }

        public Criteria andFinTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIN_TOTAL <=", value, "finTotal");
            return (Criteria) this;
        }

        public Criteria andFinTotalIn(List<BigDecimal> values) {
            addCriterion("FIN_TOTAL in", values, "finTotal");
            return (Criteria) this;
        }

        public Criteria andFinTotalNotIn(List<BigDecimal> values) {
            addCriterion("FIN_TOTAL not in", values, "finTotal");
            return (Criteria) this;
        }

        public Criteria andFinTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIN_TOTAL between", value1, value2, "finTotal");
            return (Criteria) this;
        }

        public Criteria andFinTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIN_TOTAL not between", value1, value2, "finTotal");
            return (Criteria) this;
        }

        public Criteria andCrdJkIsNull() {
            addCriterion("CRD_JK is null");
            return (Criteria) this;
        }

        public Criteria andCrdJkIsNotNull() {
            addCriterion("CRD_JK is not null");
            return (Criteria) this;
        }

        public Criteria andCrdJkEqualTo(BigDecimal value) {
            addCriterion("CRD_JK =", value, "crdJk");
            return (Criteria) this;
        }

        public Criteria andCrdJkNotEqualTo(BigDecimal value) {
            addCriterion("CRD_JK <>", value, "crdJk");
            return (Criteria) this;
        }

        public Criteria andCrdJkGreaterThan(BigDecimal value) {
            addCriterion("CRD_JK >", value, "crdJk");
            return (Criteria) this;
        }

        public Criteria andCrdJkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CRD_JK >=", value, "crdJk");
            return (Criteria) this;
        }

        public Criteria andCrdJkLessThan(BigDecimal value) {
            addCriterion("CRD_JK <", value, "crdJk");
            return (Criteria) this;
        }

        public Criteria andCrdJkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CRD_JK <=", value, "crdJk");
            return (Criteria) this;
        }

        public Criteria andCrdJkIn(List<BigDecimal> values) {
            addCriterion("CRD_JK in", values, "crdJk");
            return (Criteria) this;
        }

        public Criteria andCrdJkNotIn(List<BigDecimal> values) {
            addCriterion("CRD_JK not in", values, "crdJk");
            return (Criteria) this;
        }

        public Criteria andCrdJkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRD_JK between", value1, value2, "crdJk");
            return (Criteria) this;
        }

        public Criteria andCrdJkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRD_JK not between", value1, value2, "crdJk");
            return (Criteria) this;
        }

        public Criteria andCrdBjkIsNull() {
            addCriterion("CRD_BJK is null");
            return (Criteria) this;
        }

        public Criteria andCrdBjkIsNotNull() {
            addCriterion("CRD_BJK is not null");
            return (Criteria) this;
        }

        public Criteria andCrdBjkEqualTo(BigDecimal value) {
            addCriterion("CRD_BJK =", value, "crdBjk");
            return (Criteria) this;
        }

        public Criteria andCrdBjkNotEqualTo(BigDecimal value) {
            addCriterion("CRD_BJK <>", value, "crdBjk");
            return (Criteria) this;
        }

        public Criteria andCrdBjkGreaterThan(BigDecimal value) {
            addCriterion("CRD_BJK >", value, "crdBjk");
            return (Criteria) this;
        }

        public Criteria andCrdBjkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CRD_BJK >=", value, "crdBjk");
            return (Criteria) this;
        }

        public Criteria andCrdBjkLessThan(BigDecimal value) {
            addCriterion("CRD_BJK <", value, "crdBjk");
            return (Criteria) this;
        }

        public Criteria andCrdBjkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CRD_BJK <=", value, "crdBjk");
            return (Criteria) this;
        }

        public Criteria andCrdBjkIn(List<BigDecimal> values) {
            addCriterion("CRD_BJK in", values, "crdBjk");
            return (Criteria) this;
        }

        public Criteria andCrdBjkNotIn(List<BigDecimal> values) {
            addCriterion("CRD_BJK not in", values, "crdBjk");
            return (Criteria) this;
        }

        public Criteria andCrdBjkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRD_BJK between", value1, value2, "crdBjk");
            return (Criteria) this;
        }

        public Criteria andCrdBjkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRD_BJK not between", value1, value2, "crdBjk");
            return (Criteria) this;
        }

        public Criteria andCrdCskIsNull() {
            addCriterion("CRD_CSK is null");
            return (Criteria) this;
        }

        public Criteria andCrdCskIsNotNull() {
            addCriterion("CRD_CSK is not null");
            return (Criteria) this;
        }

        public Criteria andCrdCskEqualTo(BigDecimal value) {
            addCriterion("CRD_CSK =", value, "crdCsk");
            return (Criteria) this;
        }

        public Criteria andCrdCskNotEqualTo(BigDecimal value) {
            addCriterion("CRD_CSK <>", value, "crdCsk");
            return (Criteria) this;
        }

        public Criteria andCrdCskGreaterThan(BigDecimal value) {
            addCriterion("CRD_CSK >", value, "crdCsk");
            return (Criteria) this;
        }

        public Criteria andCrdCskGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CRD_CSK >=", value, "crdCsk");
            return (Criteria) this;
        }

        public Criteria andCrdCskLessThan(BigDecimal value) {
            addCriterion("CRD_CSK <", value, "crdCsk");
            return (Criteria) this;
        }

        public Criteria andCrdCskLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CRD_CSK <=", value, "crdCsk");
            return (Criteria) this;
        }

        public Criteria andCrdCskIn(List<BigDecimal> values) {
            addCriterion("CRD_CSK in", values, "crdCsk");
            return (Criteria) this;
        }

        public Criteria andCrdCskNotIn(List<BigDecimal> values) {
            addCriterion("CRD_CSK not in", values, "crdCsk");
            return (Criteria) this;
        }

        public Criteria andCrdCskBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRD_CSK between", value1, value2, "crdCsk");
            return (Criteria) this;
        }

        public Criteria andCrdCskNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CRD_CSK not between", value1, value2, "crdCsk");
            return (Criteria) this;
        }

        public Criteria andFinSumbalIsNull() {
            addCriterion("FIN_SUMBAL is null");
            return (Criteria) this;
        }

        public Criteria andFinSumbalIsNotNull() {
            addCriterion("FIN_SUMBAL is not null");
            return (Criteria) this;
        }

        public Criteria andFinSumbalEqualTo(BigDecimal value) {
            addCriterion("FIN_SUMBAL =", value, "finSumbal");
            return (Criteria) this;
        }

        public Criteria andFinSumbalNotEqualTo(BigDecimal value) {
            addCriterion("FIN_SUMBAL <>", value, "finSumbal");
            return (Criteria) this;
        }

        public Criteria andFinSumbalGreaterThan(BigDecimal value) {
            addCriterion("FIN_SUMBAL >", value, "finSumbal");
            return (Criteria) this;
        }

        public Criteria andFinSumbalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIN_SUMBAL >=", value, "finSumbal");
            return (Criteria) this;
        }

        public Criteria andFinSumbalLessThan(BigDecimal value) {
            addCriterion("FIN_SUMBAL <", value, "finSumbal");
            return (Criteria) this;
        }

        public Criteria andFinSumbalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIN_SUMBAL <=", value, "finSumbal");
            return (Criteria) this;
        }

        public Criteria andFinSumbalIn(List<BigDecimal> values) {
            addCriterion("FIN_SUMBAL in", values, "finSumbal");
            return (Criteria) this;
        }

        public Criteria andFinSumbalNotIn(List<BigDecimal> values) {
            addCriterion("FIN_SUMBAL not in", values, "finSumbal");
            return (Criteria) this;
        }

        public Criteria andFinSumbalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIN_SUMBAL between", value1, value2, "finSumbal");
            return (Criteria) this;
        }

        public Criteria andFinSumbalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIN_SUMBAL not between", value1, value2, "finSumbal");
            return (Criteria) this;
        }

        public Criteria andIiasTypIsNull() {
            addCriterion("IIAS_TYP is null");
            return (Criteria) this;
        }

        public Criteria andIiasTypIsNotNull() {
            addCriterion("IIAS_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andIiasTypEqualTo(String value) {
            addCriterion("IIAS_TYP =", value, "iiasTyp");
            return (Criteria) this;
        }

        public Criteria andIiasTypNotEqualTo(String value) {
            addCriterion("IIAS_TYP <>", value, "iiasTyp");
            return (Criteria) this;
        }

        public Criteria andIiasTypGreaterThan(String value) {
            addCriterion("IIAS_TYP >", value, "iiasTyp");
            return (Criteria) this;
        }

        public Criteria andIiasTypGreaterThanOrEqualTo(String value) {
            addCriterion("IIAS_TYP >=", value, "iiasTyp");
            return (Criteria) this;
        }

        public Criteria andIiasTypLessThan(String value) {
            addCriterion("IIAS_TYP <", value, "iiasTyp");
            return (Criteria) this;
        }

        public Criteria andIiasTypLessThanOrEqualTo(String value) {
            addCriterion("IIAS_TYP <=", value, "iiasTyp");
            return (Criteria) this;
        }

        public Criteria andIiasTypLike(String value) {
            addCriterion("IIAS_TYP like", value, "iiasTyp");
            return (Criteria) this;
        }

        public Criteria andIiasTypNotLike(String value) {
            addCriterion("IIAS_TYP not like", value, "iiasTyp");
            return (Criteria) this;
        }

        public Criteria andIiasTypIn(List<String> values) {
            addCriterion("IIAS_TYP in", values, "iiasTyp");
            return (Criteria) this;
        }

        public Criteria andIiasTypNotIn(List<String> values) {
            addCriterion("IIAS_TYP not in", values, "iiasTyp");
            return (Criteria) this;
        }

        public Criteria andIiasTypBetween(String value1, String value2) {
            addCriterion("IIAS_TYP between", value1, value2, "iiasTyp");
            return (Criteria) this;
        }

        public Criteria andIiasTypNotBetween(String value1, String value2) {
            addCriterion("IIAS_TYP not between", value1, value2, "iiasTyp");
            return (Criteria) this;
        }

        public Criteria andInsuCntIsNull() {
            addCriterion("INSU_CNT is null");
            return (Criteria) this;
        }

        public Criteria andInsuCntIsNotNull() {
            addCriterion("INSU_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andInsuCntEqualTo(BigDecimal value) {
            addCriterion("INSU_CNT =", value, "insuCnt");
            return (Criteria) this;
        }

        public Criteria andInsuCntNotEqualTo(BigDecimal value) {
            addCriterion("INSU_CNT <>", value, "insuCnt");
            return (Criteria) this;
        }

        public Criteria andInsuCntGreaterThan(BigDecimal value) {
            addCriterion("INSU_CNT >", value, "insuCnt");
            return (Criteria) this;
        }

        public Criteria andInsuCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSU_CNT >=", value, "insuCnt");
            return (Criteria) this;
        }

        public Criteria andInsuCntLessThan(BigDecimal value) {
            addCriterion("INSU_CNT <", value, "insuCnt");
            return (Criteria) this;
        }

        public Criteria andInsuCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSU_CNT <=", value, "insuCnt");
            return (Criteria) this;
        }

        public Criteria andInsuCntIn(List<BigDecimal> values) {
            addCriterion("INSU_CNT in", values, "insuCnt");
            return (Criteria) this;
        }

        public Criteria andInsuCntNotIn(List<BigDecimal> values) {
            addCriterion("INSU_CNT not in", values, "insuCnt");
            return (Criteria) this;
        }

        public Criteria andInsuCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSU_CNT between", value1, value2, "insuCnt");
            return (Criteria) this;
        }

        public Criteria andInsuCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSU_CNT not between", value1, value2, "insuCnt");
            return (Criteria) this;
        }

        public Criteria andInsuAmtIsNull() {
            addCriterion("INSU_AMT is null");
            return (Criteria) this;
        }

        public Criteria andInsuAmtIsNotNull() {
            addCriterion("INSU_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andInsuAmtEqualTo(BigDecimal value) {
            addCriterion("INSU_AMT =", value, "insuAmt");
            return (Criteria) this;
        }

        public Criteria andInsuAmtNotEqualTo(BigDecimal value) {
            addCriterion("INSU_AMT <>", value, "insuAmt");
            return (Criteria) this;
        }

        public Criteria andInsuAmtGreaterThan(BigDecimal value) {
            addCriterion("INSU_AMT >", value, "insuAmt");
            return (Criteria) this;
        }

        public Criteria andInsuAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSU_AMT >=", value, "insuAmt");
            return (Criteria) this;
        }

        public Criteria andInsuAmtLessThan(BigDecimal value) {
            addCriterion("INSU_AMT <", value, "insuAmt");
            return (Criteria) this;
        }

        public Criteria andInsuAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSU_AMT <=", value, "insuAmt");
            return (Criteria) this;
        }

        public Criteria andInsuAmtIn(List<BigDecimal> values) {
            addCriterion("INSU_AMT in", values, "insuAmt");
            return (Criteria) this;
        }

        public Criteria andInsuAmtNotIn(List<BigDecimal> values) {
            addCriterion("INSU_AMT not in", values, "insuAmt");
            return (Criteria) this;
        }

        public Criteria andInsuAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSU_AMT between", value1, value2, "insuAmt");
            return (Criteria) this;
        }

        public Criteria andInsuAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSU_AMT not between", value1, value2, "insuAmt");
            return (Criteria) this;
        }

        public Criteria andZgoldTypIsNull() {
            addCriterion("ZGOLD_TYP is null");
            return (Criteria) this;
        }

        public Criteria andZgoldTypIsNotNull() {
            addCriterion("ZGOLD_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andZgoldTypEqualTo(String value) {
            addCriterion("ZGOLD_TYP =", value, "zgoldTyp");
            return (Criteria) this;
        }

        public Criteria andZgoldTypNotEqualTo(String value) {
            addCriterion("ZGOLD_TYP <>", value, "zgoldTyp");
            return (Criteria) this;
        }

        public Criteria andZgoldTypGreaterThan(String value) {
            addCriterion("ZGOLD_TYP >", value, "zgoldTyp");
            return (Criteria) this;
        }

        public Criteria andZgoldTypGreaterThanOrEqualTo(String value) {
            addCriterion("ZGOLD_TYP >=", value, "zgoldTyp");
            return (Criteria) this;
        }

        public Criteria andZgoldTypLessThan(String value) {
            addCriterion("ZGOLD_TYP <", value, "zgoldTyp");
            return (Criteria) this;
        }

        public Criteria andZgoldTypLessThanOrEqualTo(String value) {
            addCriterion("ZGOLD_TYP <=", value, "zgoldTyp");
            return (Criteria) this;
        }

        public Criteria andZgoldTypLike(String value) {
            addCriterion("ZGOLD_TYP like", value, "zgoldTyp");
            return (Criteria) this;
        }

        public Criteria andZgoldTypNotLike(String value) {
            addCriterion("ZGOLD_TYP not like", value, "zgoldTyp");
            return (Criteria) this;
        }

        public Criteria andZgoldTypIn(List<String> values) {
            addCriterion("ZGOLD_TYP in", values, "zgoldTyp");
            return (Criteria) this;
        }

        public Criteria andZgoldTypNotIn(List<String> values) {
            addCriterion("ZGOLD_TYP not in", values, "zgoldTyp");
            return (Criteria) this;
        }

        public Criteria andZgoldTypBetween(String value1, String value2) {
            addCriterion("ZGOLD_TYP between", value1, value2, "zgoldTyp");
            return (Criteria) this;
        }

        public Criteria andZgoldTypNotBetween(String value1, String value2) {
            addCriterion("ZGOLD_TYP not between", value1, value2, "zgoldTyp");
            return (Criteria) this;
        }

        public Criteria andSecurSumIsNull() {
            addCriterion("SECUR_SUM is null");
            return (Criteria) this;
        }

        public Criteria andSecurSumIsNotNull() {
            addCriterion("SECUR_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andSecurSumEqualTo(BigDecimal value) {
            addCriterion("SECUR_SUM =", value, "securSum");
            return (Criteria) this;
        }

        public Criteria andSecurSumNotEqualTo(BigDecimal value) {
            addCriterion("SECUR_SUM <>", value, "securSum");
            return (Criteria) this;
        }

        public Criteria andSecurSumGreaterThan(BigDecimal value) {
            addCriterion("SECUR_SUM >", value, "securSum");
            return (Criteria) this;
        }

        public Criteria andSecurSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SECUR_SUM >=", value, "securSum");
            return (Criteria) this;
        }

        public Criteria andSecurSumLessThan(BigDecimal value) {
            addCriterion("SECUR_SUM <", value, "securSum");
            return (Criteria) this;
        }

        public Criteria andSecurSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SECUR_SUM <=", value, "securSum");
            return (Criteria) this;
        }

        public Criteria andSecurSumIn(List<BigDecimal> values) {
            addCriterion("SECUR_SUM in", values, "securSum");
            return (Criteria) this;
        }

        public Criteria andSecurSumNotIn(List<BigDecimal> values) {
            addCriterion("SECUR_SUM not in", values, "securSum");
            return (Criteria) this;
        }

        public Criteria andSecurSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECUR_SUM between", value1, value2, "securSum");
            return (Criteria) this;
        }

        public Criteria andSecurSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECUR_SUM not between", value1, value2, "securSum");
            return (Criteria) this;
        }

        public Criteria andSglodTypIsNull() {
            addCriterion("SGLOD_TYP is null");
            return (Criteria) this;
        }

        public Criteria andSglodTypIsNotNull() {
            addCriterion("SGLOD_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andSglodTypEqualTo(String value) {
            addCriterion("SGLOD_TYP =", value, "sglodTyp");
            return (Criteria) this;
        }

        public Criteria andSglodTypNotEqualTo(String value) {
            addCriterion("SGLOD_TYP <>", value, "sglodTyp");
            return (Criteria) this;
        }

        public Criteria andSglodTypGreaterThan(String value) {
            addCriterion("SGLOD_TYP >", value, "sglodTyp");
            return (Criteria) this;
        }

        public Criteria andSglodTypGreaterThanOrEqualTo(String value) {
            addCriterion("SGLOD_TYP >=", value, "sglodTyp");
            return (Criteria) this;
        }

        public Criteria andSglodTypLessThan(String value) {
            addCriterion("SGLOD_TYP <", value, "sglodTyp");
            return (Criteria) this;
        }

        public Criteria andSglodTypLessThanOrEqualTo(String value) {
            addCriterion("SGLOD_TYP <=", value, "sglodTyp");
            return (Criteria) this;
        }

        public Criteria andSglodTypLike(String value) {
            addCriterion("SGLOD_TYP like", value, "sglodTyp");
            return (Criteria) this;
        }

        public Criteria andSglodTypNotLike(String value) {
            addCriterion("SGLOD_TYP not like", value, "sglodTyp");
            return (Criteria) this;
        }

        public Criteria andSglodTypIn(List<String> values) {
            addCriterion("SGLOD_TYP in", values, "sglodTyp");
            return (Criteria) this;
        }

        public Criteria andSglodTypNotIn(List<String> values) {
            addCriterion("SGLOD_TYP not in", values, "sglodTyp");
            return (Criteria) this;
        }

        public Criteria andSglodTypBetween(String value1, String value2) {
            addCriterion("SGLOD_TYP between", value1, value2, "sglodTyp");
            return (Criteria) this;
        }

        public Criteria andSglodTypNotBetween(String value1, String value2) {
            addCriterion("SGLOD_TYP not between", value1, value2, "sglodTyp");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
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