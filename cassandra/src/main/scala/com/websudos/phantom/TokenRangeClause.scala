package com.websudos.phantom

import com.websudos.phantom.builder.QueryBuilder
import com.websudos.phantom.builder.clauses.WhereClause

object TokenRangeClause {

  def tokenGt(columnName: String, tokenValue: Any): WhereClause.Condition = {
    new WhereClause.Condition(QueryBuilder.Where.gt(s"token($columnName)", tokenValue.toString))
  }

  def tokenLte(columnName: String, tokenValue: Any): WhereClause.Condition = {
    new WhereClause.Condition(QueryBuilder.Where.lte(s"token($columnName)", tokenValue.toString))
  }

}