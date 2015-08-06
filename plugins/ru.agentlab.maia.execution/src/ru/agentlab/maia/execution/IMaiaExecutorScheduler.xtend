package ru.agentlab.maia.execution

interface IMaiaExecutorScheduler extends IMaiaExecutorNode {

	val static public String KEY_CURRENT_CONTEXT = "ru.agentlab.maia.execution.scheduler|current.context"

	def IMaiaExecutorNode getCurrentNode()

	def IMaiaExecutorNode getNextNode()

	def void remove(IMaiaExecutorNode context)

	def void removeAll()

	def boolean isEmpty()

	def void add(IMaiaExecutorNode context)

}