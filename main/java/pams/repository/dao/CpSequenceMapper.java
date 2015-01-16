package pams.repository.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import pams.repository.model.CpSequence;
import pams.repository.model.CpSequenceExample;

import java.util.List;

@Component

public interface CpSequenceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CP_SEQUENCE
     *
     * @mbggenerated Sat Mar 19 22:33:45 CST 2011
     */
    int countByExample(CpSequenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CP_SEQUENCE
     *
     * @mbggenerated Sat Mar 19 22:33:45 CST 2011
     */
    int deleteByExample(CpSequenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CP_SEQUENCE
     *
     * @mbggenerated Sat Mar 19 22:33:45 CST 2011
     */
    int insert(CpSequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CP_SEQUENCE
     *
     * @mbggenerated Sat Mar 19 22:33:45 CST 2011
     */
    int insertSelective(CpSequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CP_SEQUENCE
     *
     * @mbggenerated Sat Mar 19 22:33:45 CST 2011
     */
    List<CpSequence> selectByExample(CpSequenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CP_SEQUENCE
     *
     * @mbggenerated Sat Mar 19 22:33:45 CST 2011
     */
    int updateByExampleSelective(@Param("record") CpSequence record, @Param("example") CpSequenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CP_SEQUENCE
     *
     * @mbggenerated Sat Mar 19 22:33:45 CST 2011
     */
    int updateByExample(@Param("record") CpSequence record, @Param("example") CpSequenceExample example);
}