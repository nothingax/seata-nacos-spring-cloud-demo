package com.work.storage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("storage_tbl")
public class Storage {

  private Long id;
  private String commodityCode;
  private Long count;


}
