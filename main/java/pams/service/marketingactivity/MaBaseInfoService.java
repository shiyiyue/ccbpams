package pams.service.marketingactivity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pams.repository.dao.MaActiDetlMapper;
import pams.repository.dao.MaActiMainMapper;
import pams.repository.dao.sms.SmsMaMapper;
import pams.repository.model.MaActiDetl;
import pams.repository.model.MaActiDetlExample;
import pams.repository.model.MaActiMain;
import pams.repository.model.MaActiMainExample;

import java.util.List;

/**
 * Created by zhanrui on 2015/2/9.
 * 营销活动基本定义处理
 */
@Service
public class MaBaseInfoService {
    @Autowired
    private MaActiMainMapper maActiMainMapper;
    @Autowired
    private MaActiDetlMapper maActiDetlMapper;
    @Autowired
    private SmsMaMapper smsMaMapper;

    public List<MaActiMain> selectMaActivityMainDefList(){
        MaActiMainExample example = new MaActiMainExample();
        example.createCriteria().andStatusEqualTo("0");
        return maActiMainMapper.selectByExample(example);
    }
    public List<MaActiMain> selectMaActivityMainDefList(String actiNo){
        MaActiMainExample example = new MaActiMainExample();
        example.createCriteria().andStatusEqualTo("0").andActinoEqualTo(actiNo);
        return maActiMainMapper.selectByExample(example);
    }
    public List<MaActiDetl> selectMaActivityDetlList(String actiNo){
        MaActiDetlExample example = new MaActiDetlExample();
        example.createCriteria().andActinoEqualTo(actiNo);
        return maActiDetlMapper.selectByExample(example);
    }

    public String selectUserdefRptName(String rptno){
        return smsMaMapper.selectUserdefRptName(rptno);
    }

}
