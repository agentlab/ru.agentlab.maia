package ru.agentlab.maia.message.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import ru.agentlab.maia.converter.PlanEventFilterConverter;
import ru.agentlab.maia.converter.PlanEventType;
import ru.agentlab.maia.message.annotation.converter.OnMessageXXXConverter;
import ru.agentlab.maia.message.event.MessageAddedEvent;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@PlanEventType(MessageAddedEvent.class)
@PlanEventFilterConverter(OnMessageXXXConverter.class)
public @interface OnMessageReceived {

	String performative() default "";

	String protocol() default "";

	String sender() default "";

	String replyTo() default "";

	String content() default "";

	String replyWith() default "";

	String inReplyTo() default "";

	String encoding() default "";

	String language() default "";

	String ontology() default "";

	String replyByInMillisec() default "";

	String conversationId() default "";

	String postTimeStamp() default "";

}
