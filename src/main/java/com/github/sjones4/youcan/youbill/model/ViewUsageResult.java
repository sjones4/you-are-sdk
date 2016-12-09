package com.github.sjones4.youcan.youbill.model;

import java.io.Serializable;

/**
 *
 */
public class ViewUsageResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private String data;
  public String getData() {
    return data;
  }

  public void setData( final String data ) {
    this.data = data;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder( );
    sb.append( "{" );
    if (getData() != null) sb.append("data: " + getData() );
    sb.append( "}" );
    return sb.toString( );
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals( Object obj ) {
    if ( this == obj ) return true;
    if ( obj == null ) return false;

    if ( obj instanceof ViewUsageResult == false ) return false;
    final ViewUsageResult other = (ViewUsageResult) obj;

    if (other.getData() == null ^ this.getData() == null) return false;

    return true;
  }
}
