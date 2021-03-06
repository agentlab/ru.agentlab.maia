package ru.agentlab.maia.agent.belief.filter;

import java.util.Map;

import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLPropertyAssertionObject;

import ru.agentlab.maia.agent.filter.IPlanEventFilter;
import ru.agentlab.maia.agent.filter.TypeSafeEventFilter;

public class OWLPropertyAssertionObjectIsIndividual extends TypeSafeEventFilter<OWLPropertyAssertionObject> {

	IPlanEventFilter<? super OWLIndividual> matcher;

	public OWLPropertyAssertionObjectIsIndividual(IPlanEventFilter<? super OWLIndividual> matcher) {
		super();
		this.matcher = matcher;
	}

	@Override
	protected boolean matchesSafely(OWLPropertyAssertionObject object, Map<String, Object> values) {
		return (object instanceof OWLIndividual) && matcher.matches((OWLIndividual) object, values);
	}

}
