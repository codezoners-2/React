/** @jsx React.DOM */

var Timer = React.createClass({
    getInitialState: function () {
        return { };
    },

    tick: function () {
    },

    componentDidMount: function() {
    },

    componentWillUnmount: function() {
    },

    start: function() {
    },

    stop: function() {
    },

    render: function () {
        return <h1>
            <div className="row">
                <div className="panel panel-primary">
                    <div className="panel-body">
                        <div className="col-xs-offset-1 col-xs-3">
                            <button className="btn btn-default btn-lg">
                                <span className="glyphicon glyphicon-play"></span>
                            </button>
                            &nbsp;
                            <span className="label label-default">0</span>
                        </div>
                        <div className="col-xs-3">
                            <div className="progress">
                                <div className="progress-bar progress-bar-striped active"
                                     role="progressbar"
                                     aria-valuenow="0"
                                     aria-valuemin="0"
                                     aria-valuemax="100"
                                     style={{width: "0%"}}>
                                </div>
                            </div></div>
                        </div>
                    </div>
                </div>
            </h1>;
    }
});

React.renderComponent(
    <Timer />,
    document.getElementById('container')
);
