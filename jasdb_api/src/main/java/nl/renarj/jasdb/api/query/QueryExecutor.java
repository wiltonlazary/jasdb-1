/*
 * The JASDB software and code is Copyright protected 2011 and owned by Renze de Vries
 * 
 * All the code and design principals in the codebase are also Copyright 2011 
 * protected and owned Renze de Vries. Any unauthorized usage of the code or the 
 * design and principals as in this code is prohibited.
 */
package nl.renarj.jasdb.api.query;

import nl.renarj.jasdb.core.exceptions.JasDBStorageException;

public interface QueryExecutor {
	public QueryExecutor limit(int limit);
	public QueryExecutor paging(int start, int max);
	
	public QueryResult execute() throws JasDBStorageException;
}
