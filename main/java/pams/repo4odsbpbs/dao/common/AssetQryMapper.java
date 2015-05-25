package pams.repo4odsbpbs.dao.common;

import org.springframework.stereotype.Component;
import pams.repo4odsbpbs.model.QdbgGjCustInfoAll;
import pams.repo4odsbpbs.model.common.AssetQryParam;

import java.util.List;

@Component
public interface AssetQryMapper {
    int countRecords(AssetQryParam paramBean);
    List<QdbgGjCustInfoAll> selectPagedRecords(AssetQryParam paramBean);
    List<QdbgGjCustInfoAll> selectRecords(AssetQryParam paramBean);
}