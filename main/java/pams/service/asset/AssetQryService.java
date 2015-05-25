package pams.service.asset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pams.repository.dao.OdsbLargedepFlowMapper;
import pams.repository.dao.largedepflow.LargeDepFlowMapper;
import pams.repository.model.OdsbLargedepFlow;
import pams.repository.model.largedepflow.LargeDepFlowVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhanrui
 * Date: 13-1-24
 * Time: ����2:29
 * To change this template use File | Settings | File Templates.
 */
@Service
public class AssetQryService {
    @Autowired
    private OdsbLargedepFlowMapper odsbLargedepFlowMapper;
    @Autowired
    private LargeDepFlowMapper largeDepFlowMapper;

    public List<OdsbLargedepFlow> selectPagedLargeDepFlowRecords(LargeDepFlowVO paramBean){
        return largeDepFlowMapper.selectPagedLargeDepFlowRecords(paramBean);
    }

    public OdsbLargedepFlowMapper getOdsbLargedepFlowMapper() {
        return odsbLargedepFlowMapper;
    }

    public void setOdsbLargedepFlowMapper(OdsbLargedepFlowMapper odsbLargedepFlowMapper) {
        this.odsbLargedepFlowMapper = odsbLargedepFlowMapper;
    }

    public LargeDepFlowMapper getLargeDepFlowMapper() {
        return largeDepFlowMapper;
    }

    public void setLargeDepFlowMapper(LargeDepFlowMapper largeDepFlowMapper) {
        this.largeDepFlowMapper = largeDepFlowMapper;
    }
}
