package ru.agentlab.maia.message.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import ru.agentlab.maia.annotation.PlanEventFilter;
import ru.agentlab.maia.message.annotation.converter.OnMessageXXXConverter;
import ru.agentlab.maia.message.event.MessageUnhandledEvent;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@PlanEventFilter(converter = OnMessageXXXConverter.class, eventType = MessageUnhandledEvent.class)
public @interface OnMessageUnhandled {

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