package com.mparticle.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Context
 */

public class Context {
  public static final String SERIALIZED_NAME_DATA_PLAN = "data_plan";
  @SerializedName(SERIALIZED_NAME_DATA_PLAN)
  private DataPlanContext dataPlan;


  public Context dataPlan(DataPlanContext dataPlan) {
    this.dataPlan = dataPlan;
    return this;
  }

   /**
   * Get dataPlan
   * @return dataPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public DataPlanContext getDataPlan() {
    return dataPlan;
  }


  public void setDataPlan(DataPlanContext dataPlan) {
    this.dataPlan = dataPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context context = (Context) o;
    return Objects.equals(this.dataPlan, context.dataPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context {\n");
    sb.append("    dataPlan: ").append(toIndentedString(dataPlan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

