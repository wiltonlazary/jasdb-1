package nl.renarj.jasdb.api.model;

import nl.renarj.jasdb.api.metadata.Bag;
import nl.renarj.jasdb.api.metadata.Instance;
import nl.renarj.jasdb.core.exceptions.JasDBStorageException;

import java.util.List;

/**
 * This represents a DB Instance, every JasDB can have multiple instances. Each instance is a unit which can
 * contain bags which can have indexes and stored data entities.
 *
 * @author Renze de Vries
 */
public interface DBInstance extends Instance {
    /**
     * Retrieves the bag metadata for a bag with given name in this instance
     * @param bagName The name of the bag to retrieve metadata for
     * @return The bagMeta if found
     * @throws nl.renarj.jasdb.core.exceptions.JasDBStorageException If unable to load the bag metadata
     */
    Bag getBag(String bagName) throws JasDBStorageException;

    /**
     * Retrieves the list of bags for this instance
     * @return THe list of bags for this instance
     * @throws nl.renarj.jasdb.core.exceptions.JasDBStorageException If unable to retrieve the list of bags for this instance
     */
	List<Bag> getBags() throws JasDBStorageException;

    /**
     * Removes the requested bag from this instance, will remove the bag with all data and its
     * indexes
     *
     * @param bagName THe name of the bag to remove from this instance
     * @throws nl.renarj.jasdb.core.exceptions.JasDBStorageException If unable to remove the bag
     */
    void removeBag(String bagName) throws JasDBStorageException;
}
