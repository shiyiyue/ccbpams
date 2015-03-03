package pams.repository.dao.ebank;

import org.springframework.stereotype.Component;
import pams.repository.model.OdsbLargedepFlow;
import pams.repository.model.OdsbPldfBatch;
import pams.repository.model.OdsbPldfDtl;
import pams.repository.model.ebank.BatchPayrollAgencyVO;
import pams.repository.model.largedepflow.LargeDepFlowVO;

import java.util.List;

/**
 * User: zhanrui
 */
@Component
public interface BatchPayrollAgencyMapper {
    int countOdsbPldfBatchRecords(BatchPayrollAgencyVO paramBean);
    List<OdsbPldfBatch> selectOdsbPldfBatchRecords(BatchPayrollAgencyVO paramBean);

    int countOdsbPldfDtlRecords(String chanlFlowNo);
    List<OdsbPldfDtl> selectPagedOdsbPldfDtlRecords(BatchPayrollAgencyVO paramBean);
}
