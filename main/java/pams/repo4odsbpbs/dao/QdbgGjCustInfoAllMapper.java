package pams.repo4odsbpbs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pams.repo4odsbpbs.model.QdbgGjCustInfoAll;
import pams.repo4odsbpbs.model.QdbgGjCustInfoAllExample;

public interface QdbgGjCustInfoAllMapper {
    int countByExample(QdbgGjCustInfoAllExample example);

    int deleteByExample(QdbgGjCustInfoAllExample example);

    int insert(QdbgGjCustInfoAll record);

    int insertSelective(QdbgGjCustInfoAll record);

    List<QdbgGjCustInfoAll> selectByExample(QdbgGjCustInfoAllExample example);

    int updateByExampleSelective(@Param("record") QdbgGjCustInfoAll record, @Param("example") QdbgGjCustInfoAllExample example);

    int updateByExample(@Param("record") QdbgGjCustInfoAll record, @Param("example") QdbgGjCustInfoAllExample example);
}