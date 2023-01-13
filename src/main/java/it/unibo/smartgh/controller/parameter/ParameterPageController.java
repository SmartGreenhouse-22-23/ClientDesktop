package it.unibo.smartgh.controller.parameter;

import it.unibo.smartgh.model.parameter.ParameterType;
import it.unibo.smartgh.view.parameter.ParameterPageView;

public interface ParameterPageController {
    /**
     * Get the parameter page view
     * @return the parameter page view
     */
    ParameterPageView getView();

    void setParameter(ParameterType parameter);
}
