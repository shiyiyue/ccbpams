package pams.view.ebank;

import org.apache.commons.beanutils.PropertyUtils;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pams.repository.dao.ebank.BatchPayrollAgencyMapper;
import pams.repository.model.OdsbPldfDtl;
import pams.repository.model.ebank.BatchPayrollAgencyVO;

import java.util.List;
import java.util.Map;

/**
 * User: zhanrui
 * Date: 2015-02-24
 */
public class BatchPayrollAgencyLazyDataModel extends LazyDataModel<OdsbPldfDtl> {
    private static final Logger logger = LoggerFactory.getLogger(BatchPayrollAgencyLazyDataModel.class);

    private BatchPayrollAgencyVO paramBean;
    private BatchPayrollAgencyMapper batchPayrollAgencyMapper;

    public BatchPayrollAgencyLazyDataModel(BatchPayrollAgencyMapper batchPayrollAgencyMapper, BatchPayrollAgencyVO paramBean) {
        this.batchPayrollAgencyMapper = batchPayrollAgencyMapper;
        this.paramBean = paramBean;
    }

    @Override
    public List<OdsbPldfDtl> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        List<OdsbPldfDtl> dataList;
        try {
            BatchPayrollAgencyVO vo = new BatchPayrollAgencyVO();
            PropertyUtils.copyProperties(vo, paramBean);
            vo.setOffset(first);
            vo.setPagesize(first + pageSize);
            if (sortField != null) {
                vo.setSortField(changeBeanPropertyName2DBTableFieldName(sortField));
                if (sortOrder != null) {
                    if (sortOrder.compareTo(SortOrder.DESCENDING) == 0) {
                           vo.setSortOrder(" DESC ");
                    }
                }
            }else{ //默认排序字段
                vo.setSortField("SERI_NO");
                //vo.setSortField("1");
            }
            dataList = this.batchPayrollAgencyMapper.selectPagedOdsbPldfDtlRecords(vo);
        } catch (Exception e) {
            logger.error("查询数据出现错误.", e);
            throw new RuntimeException(e);
        }

        if (super.getRowCount() <= 0) {
            int total = batchPayrollAgencyMapper.countOdsbPldfDtlRecords(paramBean.getChanlFlowNo());
            this.setRowCount(total);
        }
        this.setPageSize(pageSize);
        return dataList;
    }

    private String changeBeanPropertyName2DBTableFieldName(String propertyName) {
        char[] ch = propertyName.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < propertyName.length(); i++) {
            if ('A' <= ch[i] && ch[i] <= 'Z') {
                sb.append("_");
                sb.append(String.valueOf(ch[i]).toLowerCase());
            }else{
                sb.append(String.valueOf(ch[i]).toLowerCase());
            }
        }
        return sb.toString();
    }
}
