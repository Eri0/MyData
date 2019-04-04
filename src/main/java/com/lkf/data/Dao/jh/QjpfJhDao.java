package com.lkf.data.Dao.jh;

import com.lkf.data.model.Plan.Qjpfplan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


@Mapper
public interface QjpfJhDao {
    String TABLE_NAME = "fm_ws_tbgz_jh";
    String INSET_FIELDS = "id, sbid, xzqh, sxmc,czmc, xmmc,pfwh, qjpfgzgy, cbpzgzgm, jhwcgzgm, ycwgzgm, ybwc," +
            "gzxmztz, ybtz, jhwh, jsksny,jsjsny, sghtqdny, xmkgny, jdlx, zyzj, sjzj";
    String SELECT_FIELDS = "id, sbid, xzqh, sxmc,czmc, xmmc,pfwh, qjpfgzgy, cbpzgzgm, jhwcgzgm, ycwgzgm, ybwc," +
            "gzxmztz, ybtz, jhwh, jsksny,jsjsny, sghtqdny, xmkgny, jdlx, zyzj, sjzj";

    /*
    select sum(gzxmztz) ,Year(jsksny) from fm_ws_tbgz_jh GROUP BY Year(jsksny);
     */
    @Select({"select sum(gzxmztz) ,Year(jsksny) from",TABLE_NAME ,"GROUP BY Year(jsksny)"})
    List<Map<Integer,Integer>> SumAndYear();


    /*
    SELECT  p.name as 地区, sum(jh.gzxmztz) as 地区总投资  from  fm_ws_tbgz_jh as jh
    left join 	fm_div_county as c on jh.xzqh = c.code
    left join   fm_div_prefecture p on c.superiorcode = p.code GROUP BY p.name;
     */
    @Select({"SELECT  p.name as 地区, sum(jh.gzxmztz) as 地区总投资  from  fm_ws_tbgz_jh as jh " +
            "left join  fm_div_county as c on jh.xzqh = c.code " +
            "left join   fm_div_prefecture p on c.superiorcode = p.code GROUP BY p.name "})
    List<Map<Integer,Integer>>SumAndDistrct();
}
