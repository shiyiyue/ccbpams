package pams.service.asset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pams.repo4odsbpbs.dao.QdbgGjCustInfoAllMapper;
import pams.repo4odsbpbs.dao.common.AssetQryMapper;
import pams.repo4odsbpbs.model.QdbgGjCustInfoAll;
import pams.repo4odsbpbs.model.QdbgGjCustInfoAllExample;
import pams.repo4odsbpbs.model.common.AssetQryParam;
import pams.repository.dao.OdsbLargedepFlowMapper;
import pams.repository.dao.largedepflow.LargeDepFlowMapper;
import pams.repository.model.OdsbLargedepFlow;
import pams.repository.model.largedepflow.LargeDepFlowVO;

import java.util.List;

/**
 * User: zhanrui
 * Date: 2015-5
 */
@Service
public class AssetQryService {
    @Autowired
    private AssetQryMapper assetQryMapper;
    @Autowired
    private QdbgGjCustInfoAllMapper custInfoAllMapper;


    public int countAllAssetRecords(AssetQryParam paramBean){
        return assetQryMapper.countRecords(paramBean);
    }
    public List<QdbgGjCustInfoAll> selectPagedAssetRecords(AssetQryParam paramBean){
        return assetQryMapper.selectPagedRecords(paramBean);
        //return assetQryMapper.selectRecords(paramBean);
//        QdbgGjCustInfoAllExample example = new QdbgGjCustInfoAllExample();
//        example.createCriteria();
//        return custInfoAllMapper.selectByExample(example);
    }

    //====

    public AssetQryMapper getAssetQryMapper() {
        return assetQryMapper;
    }

    public void setAssetQryMapper(AssetQryMapper assetQryMapper) {
        this.assetQryMapper = assetQryMapper;
    }
}
