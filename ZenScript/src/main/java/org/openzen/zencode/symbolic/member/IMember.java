/*
 * This file is part of MineTweaker API, licensed under the MIT License (MIT).
 * 
 * Copyright (c) 2014 MineTweaker <http://minetweaker3.powerofbytes.com>
 */
package org.openzen.zencode.symbolic.member;

import java.util.List;
import org.openzen.zencode.symbolic.annotations.SymbolicAnnotation;
import org.openzen.zencode.symbolic.expression.IPartialExpression;
import org.openzen.zencode.symbolic.definition.ISymbolicDefinition;

/**
 *
 * @author Stan
 * @param <E>
 */
public interface IMember<E extends IPartialExpression<E>>
{
	public ISymbolicDefinition<E> getUnit();
	
	public int getModifiers();
	
	public List<SymbolicAnnotation<E>> getAnnotations();
	
	public void completeContents();
	
	public void validate();
}
