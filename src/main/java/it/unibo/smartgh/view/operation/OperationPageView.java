package it.unibo.smartgh.view.operation;

import it.unibo.smartgh.view.SubView;

import java.util.List;

/**
 * An interface that represents the operation page view.
 */
public interface OperationPageView extends SubView {

    /**
     * Insert a new record into the table.
     * @param date of the operation
     * @param modality of the greenhouse during the operation
     * @param parameter on which the operation is performed
     * @param action performed
     */
    void addTableRow(String date, String modality, String parameter, String action);

    /**
     * Initialize view.
     */
    void initializeView(List<String> parameters);

    /**
     * Clear the table content.
     */
    void clearTable();

    /**
     * Sort the table row according to date.
     */
    void sortTable();
}
