package org.lunifera.ecview.vaadin.ide.preview.parts;

import org.lunifera.ecview.core.common.context.IViewContext;

public interface IUiRenderedListener {

	/**
	 * Notifies the listener, that a new view has been rendered.
	 * 
	 * @param context
	 */
	public void notifyNewViewRendered(IViewContext context);

}
