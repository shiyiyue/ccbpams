package pams.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pams.repository.model.OdsbGrbNewcust;
import pams.repository.model.OdsbGrbNewcustExample;

public interface OdsbGrbNewcustMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_GRB_NEWCUST
     *
     * @mbggenerated Thu Jan 15 21:41:11 CST 2015
     */
    int countByExample(OdsbGrbNewcustExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_GRB_NEWCUST
     *
     * @mbggenerated Thu Jan 15 21:41:11 CST 2015
     */
    int deleteByExample(OdsbGrbNewcustExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_GRB_NEWCUST
     *
     * @mbggenerated Thu Jan 15 21:41:11 CST 2015
     */
    int insert(OdsbGrbNewcust record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_GRB_NEWCUST
     *
     * @mbggenerated Thu Jan 15 21:41:11 CST 2015
     */
    int insertSelective(OdsbGrbNewcust record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_GRB_NEWCUST
     *
     * @mbggenerated Thu Jan 15 21:41:11 CST 2015
     */
    List<OdsbGrbNewcust> selectByExample(OdsbGrbNewcustExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_GRB_NEWCUST
     *
     * @mbggenerated Thu Jan 15 21:41:11 CST 2015
     */
    int updateByExampleSelective(@Param("record") OdsbGrbNewcust record, @Param("example") OdsbGrbNewcustExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_GRB_NEWCUST
     *
     * @mbggenerated Thu Jan 15 21:41:11 CST 2015
     */
    int updateByExample(@Param("record") OdsbGrbNewcust record, @Param("example") OdsbGrbNewcustExample example);
}