package pams.repo4odsbpbs.dao.common;

import fip.repository.model.FipCutpaydetl;
import fip.repository.model.fip.LazyDataCutpaydetlParam;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AssetQryMapper {
    int countRecords(LazyDataCutpaydetlParam paramBean);
    List<FipCutpaydetl> selectPagedRecords(LazyDataCutpaydetlParam paramBean);
    List<FipCutpaydetl> selectRecords(LazyDataCutpaydetlParam paramBean);
}