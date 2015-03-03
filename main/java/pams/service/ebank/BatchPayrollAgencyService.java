package pams.service.ebank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pams.repository.dao.OdsbLargedepFlowMapper;
import pams.repository.dao.OdsbPldfBatchMapper;
import pams.repository.dao.OdsbPldfDtlMapper;
import pams.repository.dao.ebank.BatchPayrollAgencyMapper;
import pams.repository.dao.largedepflow.LargeDepFlowMapper;
import pams.repository.model.OdsbLargedepFlow;
import pams.repository.model.OdsbPldfBatch;
import pams.repository.model.OdsbPldfDtl;
import pams.repository.model.ebank.BatchPayrollAgencyVO;
import pams.repository.model.largedepflow.LargeDepFlowVO;

import java.util.List;

/**
 * User: zhanrui
 * Date: 20150301
 */
@Service
public class BatchPayrollAgencyService {
    @Autowired
    private OdsbPldfBatchMapper odsbPldfBatchMapper;
    @Autowired
    private OdsbPldfDtlMapper odsbPldfDtlMapper;
    @Autowired
    private BatchPayrollAgencyMapper batchPayrollAgencyMapper;

    public List<OdsbPldfBatch> selectOdsbPldfBatchRecords(BatchPayrollAgencyVO paramBean){
        return batchPayrollAgencyMapper.selectOdsbPldfBatchRecords(paramBean);
    }
    public List<OdsbPldfDtl> selectPagedOdsbPldfDtlRecords(BatchPayrollAgencyVO paramBean){
        return batchPayrollAgencyMapper.selectPagedOdsbPldfDtlRecords(paramBean);
    }

//=====

    public BatchPayrollAgencyMapper getBatchPayrollAgencyMapper() {
        return batchPayrollAgencyMapper;
    }

    public void setBatchPayrollAgencyMapper(BatchPayrollAgencyMapper batchPayrollAgencyMapper) {
        this.batchPayrollAgencyMapper = batchPayrollAgencyMapper;
    }
}
