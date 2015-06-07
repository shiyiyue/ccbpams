package pams.repo4odsbpbs.model.common;

import java.math.BigDecimal;

/**
 * User: zhanrui
 */
public class AssetQryParam {
    private String rptDate;
    private String instNo;
    private String custNo;
    private String certType;
    private String certNo;
    private String custName;
    private String tel;//��ϵ�绰
    private String startDate;
    private String endDate;

//    private BigDecimal fundAmt1; //����
//    private BigDecimal fundAmt2;
//    private BigDecimal finAmt1; //���
//    private BigDecimal finAmt2;
//    private BigDecimal ctsAmt1; //CTS
//    private BigDecimal ctsAmt2;

    private BigDecimal acctCount1;//�˻���
    private BigDecimal acctCount2;//�˻���
    private BigDecimal hqCnt1;//���ڿ�����
    private BigDecimal hqCnt2;//���ڿ�����
    private BigDecimal dqCnt1;//���ڿ�����
    private BigDecimal dqCnt2;//���ڿ�����
    private BigDecimal hqCurrBal1;//���ڵ�ǰ����ۼ�
    private BigDecimal hqCurrBal2;//���ڵ�ǰ����ۼ�
    private BigDecimal dqCurrBal1;//���ڵ�ǰ����ۼ�
    private BigDecimal dqCurrBal2;//���ڵ�ǰ����ۼ�
    private BigDecimal depTotal1; //���
    private BigDecimal depTotal2;


    private BigDecimal lnCustCnt1;//���˴������
    private BigDecimal lnCustCnt2;//���˴������
    private BigDecimal loanAmt1;//������
    private BigDecimal loanAmt2;//������
    private BigDecimal loanDate1;//��������
    private BigDecimal loanDate2;//��������
    private BigDecimal loanBal1;//�������
    private BigDecimal loanBal2;//�������

    private BigDecimal productCnt1;//��Ʋ�Ʒ��
    private BigDecimal productCnt2;//��Ʋ�Ʒ��
    private BigDecimal fRealshares1;//��Ƶ�ǰ�ݶ�
    private BigDecimal fRealshares2;//��Ƶ�ǰ�ݶ�
    private BigDecimal currAmt1; //���
    private BigDecimal currAmt2;


    private BigDecimal fundCnt1;//��������
    private BigDecimal fundCnt2;//��������
    private BigDecimal fundCost1;//����ɱ�
    private BigDecimal fundCost2;//����ɱ�
    private BigDecimal ctsSumbal1;//��֤�����
    private BigDecimal ctsSumbal2;//��֤�����


    private BigDecimal ectipTyp;//��������
    private BigDecimal chnNo;//��ͨ����

    private BigDecimal crdCrtCount1;//���ǿ���
    private BigDecimal crdCrtCount2;//���ǿ���
    private BigDecimal crdActiv1;//���ǿ�������
    private BigDecimal crdActiv2;//���ǿ�������
    private BigDecimal crdNoActiv1;//���ǿ�δ������
    private BigDecimal crdNoActiv2;//���ǿ�δ������

    private BigDecimal finTotal1;//��ƿ�����
    private BigDecimal finTotal2;//��ƿ�����
    private BigDecimal crdJk1;//��
    private BigDecimal crdJk2;//��
    private BigDecimal crdBjk1;//�׽�
    private BigDecimal crdBjk2;//�׽�
    private BigDecimal crdCsk1;//��˽��
    private BigDecimal crdCsk2;//��˽��
    private BigDecimal finSumbal1;//��ƿ����
    private BigDecimal finSumbal2;//��ƿ����

    private BigDecimal insuCnt1;//������
    private BigDecimal insuCnt2;//������
    private BigDecimal insuAmt1;//�������
    private BigDecimal insuAmt2;//�������

    private BigDecimal securSum1;//ֽ�ƽ�����
    private BigDecimal securSum2;//ֽ�ƽ�����
    private BigDecimal weight1;//ʵ��ƽ�������
    private BigDecimal weight2;//ʵ��ƽ�������


    private int offset;
    private int pagesize;
    private String sortField;
    private String sortOrder;

    public String getRptDate() {
        return rptDate;
    }

    public void setRptDate(String rptDate) {
        this.rptDate = rptDate;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getDepTotal1() {
        return depTotal1;
    }

    public void setDepTotal1(BigDecimal depTotal1) {
        this.depTotal1 = depTotal1;
    }

    public BigDecimal getDepTotal2() {
        return depTotal2;
    }

    public void setDepTotal2(BigDecimal depTotal2) {
        this.depTotal2 = depTotal2;
    }

    public BigDecimal getCurrAmt1() {
        return currAmt1;
    }

    public void setCurrAmt1(BigDecimal currAmt1) {
        this.currAmt1 = currAmt1;
    }

    public BigDecimal getCurrAmt2() {
        return currAmt2;
    }

    public void setCurrAmt2(BigDecimal currAmt2) {
        this.currAmt2 = currAmt2;
    }

    public BigDecimal getCtsSumbal1() {
        return ctsSumbal1;
    }

    public void setCtsSumbal1(BigDecimal ctsSumbal1) {
        this.ctsSumbal1 = ctsSumbal1;
    }

    public BigDecimal getCtsSumbal2() {
        return ctsSumbal2;
    }

    public void setCtsSumbal2(BigDecimal ctsSumbal2) {
        this.ctsSumbal2 = ctsSumbal2;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getInstNo() {
        return instNo;
    }

    public void setInstNo(String instNo) {
        this.instNo = instNo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public BigDecimal getAcctCount1() {
        return acctCount1;
    }

    public void setAcctCount1(BigDecimal acctCount1) {
        this.acctCount1 = acctCount1;
    }

    public BigDecimal getAcctCount2() {
        return acctCount2;
    }

    public void setAcctCount2(BigDecimal acctCount2) {
        this.acctCount2 = acctCount2;
    }

    public BigDecimal getHqCnt1() {
        return hqCnt1;
    }

    public void setHqCnt1(BigDecimal hqCnt1) {
        this.hqCnt1 = hqCnt1;
    }

    public BigDecimal getHqCnt2() {
        return hqCnt2;
    }

    public void setHqCnt2(BigDecimal hqCnt2) {
        this.hqCnt2 = hqCnt2;
    }

    public BigDecimal getDqCnt1() {
        return dqCnt1;
    }

    public void setDqCnt1(BigDecimal dqCnt1) {
        this.dqCnt1 = dqCnt1;
    }

    public BigDecimal getDqCnt2() {
        return dqCnt2;
    }

    public void setDqCnt2(BigDecimal dqCnt2) {
        this.dqCnt2 = dqCnt2;
    }

    public BigDecimal getHqCurrBal1() {
        return hqCurrBal1;
    }

    public void setHqCurrBal1(BigDecimal hqCurrBal1) {
        this.hqCurrBal1 = hqCurrBal1;
    }

    public BigDecimal getHqCurrBal2() {
        return hqCurrBal2;
    }

    public void setHqCurrBal2(BigDecimal hqCurrBal2) {
        this.hqCurrBal2 = hqCurrBal2;
    }

    public BigDecimal getDqCurrBal1() {
        return dqCurrBal1;
    }

    public void setDqCurrBal1(BigDecimal dqCurrBal1) {
        this.dqCurrBal1 = dqCurrBal1;
    }

    public BigDecimal getDqCurrBal2() {
        return dqCurrBal2;
    }

    public void setDqCurrBal2(BigDecimal dqCurrBal2) {
        this.dqCurrBal2 = dqCurrBal2;
    }

    public BigDecimal getLnCustCnt1() {
        return lnCustCnt1;
    }

    public void setLnCustCnt1(BigDecimal lnCustCnt1) {
        this.lnCustCnt1 = lnCustCnt1;
    }

    public BigDecimal getLnCustCnt2() {
        return lnCustCnt2;
    }

    public void setLnCustCnt2(BigDecimal lnCustCnt2) {
        this.lnCustCnt2 = lnCustCnt2;
    }

    public BigDecimal getLoanAmt1() {
        return loanAmt1;
    }

    public void setLoanAmt1(BigDecimal loanAmt1) {
        this.loanAmt1 = loanAmt1;
    }

    public BigDecimal getLoanAmt2() {
        return loanAmt2;
    }

    public void setLoanAmt2(BigDecimal loanAmt2) {
        this.loanAmt2 = loanAmt2;
    }

    public BigDecimal getLoanDate1() {
        return loanDate1;
    }

    public void setLoanDate1(BigDecimal loanDate1) {
        this.loanDate1 = loanDate1;
    }

    public BigDecimal getLoanDate2() {
        return loanDate2;
    }

    public void setLoanDate2(BigDecimal loanDate2) {
        this.loanDate2 = loanDate2;
    }

    public BigDecimal getLoanBal1() {
        return loanBal1;
    }

    public void setLoanBal1(BigDecimal loanBal1) {
        this.loanBal1 = loanBal1;
    }

    public BigDecimal getLoanBal2() {
        return loanBal2;
    }

    public void setLoanBal2(BigDecimal loanBal2) {
        this.loanBal2 = loanBal2;
    }

    public BigDecimal getProductCnt1() {
        return productCnt1;
    }

    public void setProductCnt1(BigDecimal productCnt1) {
        this.productCnt1 = productCnt1;
    }

    public BigDecimal getProductCnt2() {
        return productCnt2;
    }

    public void setProductCnt2(BigDecimal productCnt2) {
        this.productCnt2 = productCnt2;
    }

    public BigDecimal getfRealshares1() {
        return fRealshares1;
    }

    public void setfRealshares1(BigDecimal fRealshares1) {
        this.fRealshares1 = fRealshares1;
    }

    public BigDecimal getfRealshares2() {
        return fRealshares2;
    }

    public void setfRealshares2(BigDecimal fRealshares2) {
        this.fRealshares2 = fRealshares2;
    }

    public BigDecimal getFundCnt1() {
        return fundCnt1;
    }

    public void setFundCnt1(BigDecimal fundCnt1) {
        this.fundCnt1 = fundCnt1;
    }

    public BigDecimal getFundCnt2() {
        return fundCnt2;
    }

    public void setFundCnt2(BigDecimal fundCnt2) {
        this.fundCnt2 = fundCnt2;
    }

    public BigDecimal getFundCost1() {
        return fundCost1;
    }

    public void setFundCost1(BigDecimal fundCost1) {
        this.fundCost1 = fundCost1;
    }

    public BigDecimal getFundCost2() {
        return fundCost2;
    }

    public void setFundCost2(BigDecimal fundCost2) {
        this.fundCost2 = fundCost2;
    }

    public BigDecimal getEctipTyp() {
        return ectipTyp;
    }

    public void setEctipTyp(BigDecimal ectipTyp) {
        this.ectipTyp = ectipTyp;
    }

    public BigDecimal getChnNo() {
        return chnNo;
    }

    public void setChnNo(BigDecimal chnNo) {
        this.chnNo = chnNo;
    }

    public BigDecimal getCrdCrtCount1() {
        return crdCrtCount1;
    }

    public void setCrdCrtCount1(BigDecimal crdCrtCount1) {
        this.crdCrtCount1 = crdCrtCount1;
    }

    public BigDecimal getCrdCrtCount2() {
        return crdCrtCount2;
    }

    public void setCrdCrtCount2(BigDecimal crdCrtCount2) {
        this.crdCrtCount2 = crdCrtCount2;
    }

    public BigDecimal getCrdActiv1() {
        return crdActiv1;
    }

    public void setCrdActiv1(BigDecimal crdActiv1) {
        this.crdActiv1 = crdActiv1;
    }

    public BigDecimal getCrdActiv2() {
        return crdActiv2;
    }

    public void setCrdActiv2(BigDecimal crdActiv2) {
        this.crdActiv2 = crdActiv2;
    }

    public BigDecimal getCrdNoActiv1() {
        return crdNoActiv1;
    }

    public void setCrdNoActiv1(BigDecimal crdNoActiv1) {
        this.crdNoActiv1 = crdNoActiv1;
    }

    public BigDecimal getCrdNoActiv2() {
        return crdNoActiv2;
    }

    public void setCrdNoActiv2(BigDecimal crdNoActiv2) {
        this.crdNoActiv2 = crdNoActiv2;
    }

    public BigDecimal getFinTotal1() {
        return finTotal1;
    }

    public void setFinTotal1(BigDecimal finTotal1) {
        this.finTotal1 = finTotal1;
    }

    public BigDecimal getFinTotal2() {
        return finTotal2;
    }

    public void setFinTotal2(BigDecimal finTotal2) {
        this.finTotal2 = finTotal2;
    }

    public BigDecimal getCrdJk2() {
        return crdJk2;
    }

    public void setCrdJk2(BigDecimal crdJk2) {
        this.crdJk2 = crdJk2;
    }

    public BigDecimal getCrdBjk1() {
        return crdBjk1;
    }

    public void setCrdBjk1(BigDecimal crdBjk1) {
        this.crdBjk1 = crdBjk1;
    }

    public BigDecimal getCrdBjk2() {
        return crdBjk2;
    }

    public void setCrdBjk2(BigDecimal crdBjk2) {
        this.crdBjk2 = crdBjk2;
    }

    public BigDecimal getCrdCsk1() {
        return crdCsk1;
    }

    public void setCrdCsk1(BigDecimal crdCsk1) {
        this.crdCsk1 = crdCsk1;
    }

    public BigDecimal getCrdCsk2() {
        return crdCsk2;
    }

    public void setCrdCsk2(BigDecimal crdCsk2) {
        this.crdCsk2 = crdCsk2;
    }


    public BigDecimal getInsuCnt1() {
        return insuCnt1;
    }

    public void setInsuCnt1(BigDecimal insuCnt1) {
        this.insuCnt1 = insuCnt1;
    }

    public BigDecimal getInsuCnt2() {
        return insuCnt2;
    }

    public void setInsuCnt2(BigDecimal insuCnt2) {
        this.insuCnt2 = insuCnt2;
    }

    public BigDecimal getInsuAmt1() {
        return insuAmt1;
    }

    public void setInsuAmt1(BigDecimal insuAmt1) {
        this.insuAmt1 = insuAmt1;
    }

    public BigDecimal getInsuAmt2() {
        return insuAmt2;
    }

    public void setInsuAmt2(BigDecimal insuAmt2) {
        this.insuAmt2 = insuAmt2;
    }

    public BigDecimal getSecurSum1() {
        return securSum1;
    }

    public void setSecurSum1(BigDecimal securSum1) {
        this.securSum1 = securSum1;
    }

    public BigDecimal getSecurSum2() {
        return securSum2;
    }

    public void setSecurSum2(BigDecimal securSum2) {
        this.securSum2 = securSum2;
    }

    public BigDecimal getWeight1() {
        return weight1;
    }

    public void setWeight1(BigDecimal weight1) {
        this.weight1 = weight1;
    }

    public BigDecimal getWeight2() {
        return weight2;
    }

    public void setWeight2(BigDecimal weight2) {
        this.weight2 = weight2;
    }

    public BigDecimal getCrdJk1() {
        return crdJk1;
    }

    public void setCrdJk1(BigDecimal crdJk1) {
        this.crdJk1 = crdJk1;
    }

    public BigDecimal getFinSumbal1() {
        return finSumbal1;
    }

    public void setFinSumbal1(BigDecimal finSumbal1) {
        this.finSumbal1 = finSumbal1;
    }

    public BigDecimal getFinSumbal2() {
        return finSumbal2;
    }

    public void setFinSumbal2(BigDecimal finSumbal2) {
        this.finSumbal2 = finSumbal2;
    }
}
