package skyline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pams.repository.model.Ptenudetail;

import javax.faces.model.SelectItem;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhanrui
 * Date: 11-4-22
 * Time: 下午2:32
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ToolsService {

    @Autowired
    PlatformService platformService;


    /**
     * 根据枚举表的内容组下拉菜单
     *
     * @param enuName     枚举名称
     * @param isSelectAll 是否添加全部项选择
     * @param isExpandID  true:正常列表（不包含ID） false：列表中包含ID
     * @return 下拉菜单
     */
    public List<SelectItem> getEnuSelectItemList(String enuName, boolean isSelectAll, boolean isExpandID) {
        List<Ptenudetail> records = platformService.selectEnuDetail(enuName);
        List<SelectItem> items = new ArrayList<SelectItem>();
        SelectItem item;
        if (isSelectAll) {
            item = new SelectItem("", "全部");
            items.add(item);
        }
        for (Ptenudetail record : records) {
            if (isExpandID) {
                item = new SelectItem(record.getEnuitemvalue(), record.getEnuitemvalue() + " " + record.getEnuitemlabel());
            } else {
                item = new SelectItem(record.getEnuitemvalue(), record.getEnuitemlabel());
            }
            items.add(item);
        }
        return items;
    }

    //enuItemValue + enuItemExpand
    public List<SelectItem> getEnuSelectItemList4Expand(String enuName, boolean isSelectAll) {
        List<Ptenudetail> records = platformService.selectEnuDetail(enuName);
        List<SelectItem> items = new ArrayList<SelectItem>();
        SelectItem item;
        if (isSelectAll) {
            item = new SelectItem("", "全部");
            items.add(item);
        }
        for (Ptenudetail record : records) {
            item = new SelectItem(record.getEnuitemvalue(), record.getEnuitemexpand());
            items.add(item);
        }
        return items;
    }

    /**
     * 获取本机构号下所有机构清单
     *
     * @param branchId 本机构号
     * @return 机构选择列表
     */
    public List<SelectItem> selectBranchList(String branchId) {
        List<String> records = platformService.selectBranchLevelString(branchId);
        List<SelectItem> selectItems = new ArrayList<SelectItem>();
        for (String record : records) {
            String[] recordArray = record.split("\\|");
            SelectItem item = new SelectItem(recordArray[0], recordArray[1]);
            selectItems.add(item);
        }
        return selectItems;
    }

}
