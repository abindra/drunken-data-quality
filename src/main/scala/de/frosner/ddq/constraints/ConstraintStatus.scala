package de.frosner.ddq.constraints

sealed trait ConstraintStatus {
  val stringValue: String
}

case object ConstraintSuccess extends ConstraintStatus {
  val stringValue = "Success"
}

case object ConstraintFailure extends ConstraintStatus {
  val stringValue = "Failure"
}

case class ConstraintError(throwable: Throwable) extends ConstraintStatus {
  val stringValue = "Error"
}
