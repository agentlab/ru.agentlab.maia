package ru.agentlab.maia.agent;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ru.agentlab.maia.IRole;
import ru.agentlab.maia.agent.RoleBase;
import ru.agentlab.maia.tests.util.category.speed.QuickTests;
import ru.agentlab.maia.tests.util.category.type.UnitTests;
import ru.agentlab.maia.tests.util.category.visibility.WhiteBoxTests;

/**
 * Tests for {@link RoleBase#add(IRole)}
 * 
 * @author Dmitriy Shishkin <shishkindimon@gmail.com>
 */
@Category({ UnitTests.class, QuickTests.class, WhiteBoxTests.class })
public class RoleBase_add_NegativeUnitTests extends RoleBaseAbstractTest {

	@Test
	public void nullRole() {
		// Given
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("Role to add should be non null");
		// When
		roleBase.add(null);
	}

}
