package pams.repo4odsbpbs.dao.common;

import org.apache.ecs.xhtml.map;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import pams.repo4odsbpbs.model.QdbgGjCustInfoAll;
import pams.repo4odsbpbs.model.common.AssetQryParam;

import java.util.List;
import java.util.Map;

@Component
public interface AssetImportMapper {
//    int importData(@Param("startDate")String startDate);
    int importData(Map<String,Object> paramMap);
}