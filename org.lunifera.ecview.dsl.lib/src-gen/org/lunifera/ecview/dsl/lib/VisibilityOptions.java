package org.lunifera.ecview.dsl.lib;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

@SuppressWarnings("all")
public class VisibilityOptions implements Serializable, PropertyChangeListener {
  private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
}
